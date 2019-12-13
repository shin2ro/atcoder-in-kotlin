fun main(args: Array<String>) {
    val (n, a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(Math.min(n * a, b))
}
