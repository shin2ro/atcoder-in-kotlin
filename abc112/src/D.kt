fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val ans = (m / n downTo 1).first { (m - it * n) % it == 0 }
    println(ans)
}
