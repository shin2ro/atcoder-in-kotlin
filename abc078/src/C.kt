fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val ms = 1900 * m + 100 * (n - m)
    println(ms * Math.pow(2.0, m.toDouble()).toInt())
}
