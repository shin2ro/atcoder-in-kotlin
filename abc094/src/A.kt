fun main(args: Array<String>) {
    val (a, b, x) = readLine()!!.split(' ').map { it.toInt() }
    println(if (x in a..a + b) "YES" else "NO")
}
