fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val dict = (0 until n).map { readLine()!!.reversed() }.sorted().map { it.reversed() }
    dict.forEach { println(it) }
}
