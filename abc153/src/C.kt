fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val h = readLine()!!.split(' ').map { it.toLong() }.sortedDescending()
    println(h.slice(k until n).sum())
}
