fun main(args: Array<String>) {

    val mod = 1e9.toLong() + 7

    class Comb {

        val n = 1e5.toInt()

        val fact = LongArray(n + 1)
        val factInv = LongArray(n + 1)

        init {
            fact[1] = 1L
            for (i in 2 .. n) {
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
    var a = readLine()!!.split(' ').map { it.toLong() }.sorted()

    val ans = LongArray(2)

    repeat(2) {
        for (i in 0 until n) {
            if (i + 1 < k) continue
            if (a[i] >= 0) {
                val b = a[i] * cb.comb(i, k - 1) % mod
                ans[it] = ans[it] + b % mod
            } else {
                val b = -a[i] * cb.comb(i, k - 1) % mod
                ans[it] = (ans[it] + mod - b) % mod
            }
        }
        a = a.reversed()
    }

    println((ans[0] + mod - ans[1]) % mod)
}
