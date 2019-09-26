fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(if (a * b % 2 == 1) "Yes" else "No")
}
