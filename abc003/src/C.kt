fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val rs = readLine()!!.split(' ').map { it.toDouble() }.sortedDescending()
    rs.take(k).foldRight(0.0) { r, acc -> (acc + r) / 2 }.let { println(it) }
}
