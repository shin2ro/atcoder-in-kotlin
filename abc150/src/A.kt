fun main(args: Array<String>) {
    val (k, x) = readLine()!!.split(' ').map { it.toInt() }
    println(if (500 * k >= x) "Yes" else "No")
}
