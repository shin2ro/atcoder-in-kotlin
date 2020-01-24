fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(' ').map { it.toInt() }
    (1 until n - 1)
            .filter { p.slice(it - 1..it + 1).sorted()[1] == p[it] }
            .count()
            .let { println(it) }
}
