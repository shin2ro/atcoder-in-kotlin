fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = (0 until n).map { readLine()!!.toInt() }
    val (x1, x2) = xs.sortedDescending().take(2)
    xs.forEach { println(if (it == x1) x2 else x1) }
}
