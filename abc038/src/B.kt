fun main(args: Array<String>) {
    val xs1 = readLine()!!.split(' ').map { it.toInt() }
    val xs2 = readLine()!!.split(' ').map { it.toInt() }
    println(if (xs1.any { xs2.contains(it) }) "YES" else "NO")
}
