fun main(args: Array<String>) {
    val (n, k, m) = readLine()!!.split(' ').map { it.toInt() }
    val s = readLine()!!.split(' ').map { it.toInt() }.sum()
    val x = Math.max(n * m - s, 0)
    println(if (x <= k) x else -1)
}
