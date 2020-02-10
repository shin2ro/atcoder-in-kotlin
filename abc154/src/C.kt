fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }.toSet()
    println(if (a.size == n) "YES" else "NO")
}
