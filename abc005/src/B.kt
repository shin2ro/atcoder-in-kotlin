fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    (0 until n)
            .map { readLine()!!.toInt() }
            .min()
            .let { println(it) }
}
