fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    var ans = true

    (0 until n).fold(Triple(0, 0, 0)) { acc, i ->
        val (t, x, y) = readLine()!!.split(' ').map { it.toInt() }
        val d = ((t - acc.first) - (Math.abs(x - acc.second)) - Math.abs(y - acc.third))

        if (d < 0 || d % 2 == 1) {
            ans = false
        }

        Triple(t, x, y)
    }

    println(if (ans) "Yes" else "No")
}
