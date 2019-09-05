fun main(args: Array<String>) {
    readLine()
    val xs = readLine()!!.split(' ').map { it.toInt() }
    println(xs.map { Integer.numberOfTrailingZeros(it) }.min())
}
