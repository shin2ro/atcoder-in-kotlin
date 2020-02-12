fun main(args: Array<String>) {
    val n = readLine()!!.toLong()

    fun factorize(n: Long): Map<Long, Int> {
        val r = mutableMapOf<Long, Int>()
        var x = n
        var i = 2L
        while (i * i <= n) {
            while (x % i == 0L) {
                r[i] = (r[i] ?: 0) + 1
                x /= i
            }
            i++
        }
        if (x > 1) {
            r[x] = (r[x] ?: 0) + 1
        }
        return r
    }

    val fs = factorize(n)
    val keys = fs.keys.toList()

    fun rec(list: List<Long> = emptyList()): Long {
        if (fs.isEmpty()) return 0L

        if (list.size == fs.size) {
            val x = list.reduce { acc, l -> acc * l } - 1
            return if (x > 0 && n / x == n % x) x else 0L
        }

        var r = 0L
        var i = 1L
        val key = keys[list.size]
        val cnt = fs[key] ?: 0
        repeat(cnt + 1) {
            r += rec(list.plus(i))
            i *= key
        }
        return r
    }

    println(rec())
}
