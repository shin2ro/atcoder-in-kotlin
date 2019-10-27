fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(if (a > 9 || b > 9) -1 else a * b)
}
