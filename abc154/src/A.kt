fun main(args: Array<String>) {
    val (s, t) = readLine()!!.split(' ')
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    val u = readLine()!!

    println("${if (s == u) a - 1 else a} ${if (t == u) b - 1 else b}")
}
