fun main(args: Array<String>) {
    val (h, a) = readLine()!!.split(' ').map { it.toInt() }
    println((h + a - 1) / a)
}
