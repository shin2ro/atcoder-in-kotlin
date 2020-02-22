fun main(args: Array<String>) {
    val (n, r) = readLine()!!.split(' ').map { it.toInt() }
    println(r + 100 * Math.max(10 - n, 0))
}
