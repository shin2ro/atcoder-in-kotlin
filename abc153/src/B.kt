fun main(args: Array<String>) {
    val (h, n) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toInt() }
    println(if (a.sum() >= h) "Yes" else "No")
}
