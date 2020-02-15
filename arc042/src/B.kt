fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(' ').map { it.toDouble() }
    val n = readLine()!!.toInt()
    val p = (0 until n).map {
        val (xi, yi) = readLine()!!.split(' ').map { it.toDouble() }
        xi to yi
    }

    var ans: Double? = null

    for (i in 0 until n) {
        val (x1, y1) = p[i]
        val (x2, y2) = p[(i + 1) % n]

        val (a, b, c) = if (x1 == x2) {
            Triple(1.0, 0.0, -x1)
        } else {
            val a = (y2 - y1) / (x2 - x1)
            val b = -1.0
            val c = y1 - a * x1
            Triple(a, b, c)
        }

        val d = Math.abs(a * x + b * y + c) / Math.sqrt(a * a + b * b)

        ans = Math.min(ans ?: d, d)
    }

    println(ans)
}
