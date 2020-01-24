fun main(args: Array<String>) {
    val mod = 1e9.toLong() + 7

    class Comb {

        val n = 2000

        val fact = LongArray(n + 1)
        val factInv = LongArray(n + 1)

        init {
            fact[0] = 1L
            for (i in 1..n) {
                fact[i] = fact[i - 1] * i % mod
            }
            factInv[n] = inv(fact[n])
            for (i in n downTo 1) {
                factInv[i - 1] = factInv[i] * i % mod
            }
        }

        private fun pow(base: Long, exp: Long): Long {
            if (exp == 0L) return 1L
            var a = pow(base, exp shr 1)
            a *= a
            a %= mod
            if (exp and 1L == 0L) return a
            return base * a % mod
        }

        private fun inv(x: Long): Long {
            return pow(x, mod - 2)
        }

        fun comb(n: Int, k: Int): Long {
            if (k !in 0..n) return 0L
            return fact[n] * factInv[k] % mod * factInv[n - k] % mod
        }

    }

    val cb = Comb()

    val (n, k) = readLine()!!.split(' ').map { it.toInt() }

    for (i in 1..k) {
        println(cb.comb(n - k + 1, i) * cb.comb(k - 1, i - 1) % mod)
    }

}
