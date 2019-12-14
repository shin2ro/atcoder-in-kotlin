fun main(args: Array<String>) {
    val (n, d) = readLine()!!.split(' ').map { it.toInt() }
    println((n + (2 * d)) / (2 * d + 1))
}
