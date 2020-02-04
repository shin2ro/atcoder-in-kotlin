fun main(args: Array<String>) {
    val (a, p) = readLine()!!.split(' ').map { it.toInt() }
    println((3 * a + p) / 2)
}
