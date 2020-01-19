fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    println(if (n == m) "Yes" else "No")
}
