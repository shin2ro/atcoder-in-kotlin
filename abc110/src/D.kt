fun main(args: Array<String>) {
    val mod = 1e9.toLong() + 7

    val fact = LongArray(200000)
    fact[0] = 1L
    for (i in 1 until fact.size) {
        fact[i] = i * fact[i - 1] % mod
    }

    fun factorial(n: Long): Long {
        return fact[n.toInt()]
    }

    fun div(a: Long, b: Long): Long {

        fun calc(a: Long, b: Long): Long {
            if (b == 0L) return 1L
            if (b % 2L == 0L) {
                val d = calc(a, b / 2)
                return d * d % mod
            }
            return a * calc(a, b - 1) % mod
        }

        return a * calc(b, mod - 2) % mod
    }

    fun conb(n: Long, k: Long): Long {
        return div(div(factorial(n), factorial(n - k)), factorial(k))
    }

    fun factorize(n: Int): MutableMap<Int, Int> {
        val r = mutableMapOf<Int, Int>()
        var x = n
        var i = 2
        while (i * i <= n) {
            while (x % i == 0) {
                r[i] = (r[i] ?: 0) + 1
                x /= i
            }
            i++
        }
        if (x > 1) {
            r[i] = (r[i] ?: 0) + 1
        }
        return r
    }

    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    factorize(m).values
            .map { it.toLong() }
            .fold(1L) { acc, i -> acc * conb(i + n - 1, i) % mod }
            .let { println(it) }
}
