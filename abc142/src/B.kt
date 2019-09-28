fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val hs = readLine()!!.split(' ').map { it.toInt() }
    println(hs.count { it >= k })
}
