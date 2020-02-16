fun main(args: Array<String>) {
    val xs = readLine()!!.split(' ').map { it.toInt() }
    println(if (xs.toSet().size == 2) "Yes" else "No")
}
