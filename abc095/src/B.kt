fun main(args: Array<String>) {
    val (n, x) = readLine()!!.split(' ').map { it.toInt() }
    var min = Int.MAX_VALUE
    val sum = (0 until n).map {
        val m = readLine()!!.toInt()
        min = Math.min(min, m)
        m
    }.sum()
    println(n + (x - sum) / min)
}
