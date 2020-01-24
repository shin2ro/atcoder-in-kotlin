fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val d = readLine()!!.split(' ').map { it.toInt() }.sorted()
    println(d[n / 2] - d[n / 2 - 1])
}
