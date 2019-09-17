fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    (1..n).map {
        it.toDouble() * 10000 / n
    }.sum().let { println(it) }
}
