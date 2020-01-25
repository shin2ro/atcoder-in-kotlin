fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    var all = 1
    var bad = 1
    for (i in a) {
        all *= 3
        if (i % 2 == 0) bad *= 2
    }
    println(all - bad)
}
