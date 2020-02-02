fun main(args: Array<String>) {
    val (n, a, b) = readLine()!!.split(' ').map { it.toLong() }
    val xs = readLine()!!.split(' ').map { it.toLong() }
    (1 until n.toInt())
            .map { i ->
                Math.min(a * (xs[i] - xs[i - 1]), b)
            }
            .sum()
            .let { println(it) }
}
