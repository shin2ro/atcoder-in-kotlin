fun main(args: Array<String>) {

    fun d(n: Long): Long {
        return Math.floor(Math.log10(n.toDouble()) + 1).toLong()
    }

    val (A, B, X) = readLine()!!.split(' ').map { it.toLong() }

    var ans = 0L

    var l = 1L
    var r = 1e9.toLong()

    while (l <= r) {
        val m = l + (r - l) / 2
        val y = A * m + B * d(m)

        if (y > X) {
            r = m - 1
            continue
        }

        ans = m
        l = m + 1
    }

    println(ans)
}
