fun main(args: Array<String>) {
    val (a1, a2, a3) = readLine()!!.split(' ').map { it.toInt() }
    println(if (a1 + a2 + a3 >= 22) "bust" else "win")
}
