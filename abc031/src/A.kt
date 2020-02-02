fun main(args: Array<String>) {
    val (a, d) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.max((a + 1) * d, a * (d + 1)))
}
