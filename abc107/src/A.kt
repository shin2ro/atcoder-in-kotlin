fun main(args: Array<String>) {
    val (n, i) = readLine()!!.split(' ').map { it.toInt() }
    println(n - i + 1)
}
