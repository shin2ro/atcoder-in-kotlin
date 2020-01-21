fun main(args: Array<String>) {

    class Sieve(n: Int) {
        val f = IntArray(n + 1)
        val primes = mutableListOf<Int>()

        init {
            f[0] = -1
            f[1] = -1
            for (i in 2..n) {
                if (f[i] > 0) continue
                primes.add(i)
                f[i] = i
                if (i.toLong() * i.toLong() > n) continue
                for (j in i * i..n step i) {
                    if (f[j] == 0) f[j] = i
                }
            }
        }

        fun factor(x: Int): MutableMap<Int, Int> {
            val r = mutableMapOf<Int, Int>()
            var x1 = x
            while (x1 != 1) {
                r[f[x1]] = r.getOrElse(f[x1]) { 0 } + 1
                x1 /= f[x1]
            }
            return r
        }
    }

    val mod = 1e9.toLong() + 7

    fun pow(base: Long, exp: Long): Long {
        if (exp == 0L) return 1L
        var a = pow(base, exp shr 1)
        a *= a
        a %= mod
        if (exp and 1L == 0L) return a
        return base * a % mod
    }

    fun inv(x: Long): Long {
        return pow(x, mod - 2)
    }

    val s = Sieve(1e6.toInt())

    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }

    val map = mutableMapOf<Int, Int>()
    for (i in 0 until n) {
        val fs = s.factor(a[i])
        for ((f, c) in fs) {
            map[f] = Math.max(c, map.getOrElse(f) { 0 })
        }
    }

    var lcm = 1L
    for ((f, c) in map) {
        repeat(c) {
            lcm *= f
            lcm %= mod
        }
    }

    println(a.map { lcm * inv(it.toLong()) % mod }.reduce { acc, l -> (acc + l) % mod })
}
