fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.max(Math.min(b, d) - Math.max(a, c), 0))
}
