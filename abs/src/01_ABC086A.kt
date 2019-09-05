fun main(args: Array<String>) {
    val xs = readLine()!!.split(' ').map { it.toInt() }
    println(if (xs.any { it % 2 == 0 }) "Even" else "Odd")
}
