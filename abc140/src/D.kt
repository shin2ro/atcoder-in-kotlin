fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val s = readLine()!!
    val h = (1 until n).filter { s[it] == s[it - 1] }.count()
    println(Math.min(h + 2 * k, n - 1))
}
