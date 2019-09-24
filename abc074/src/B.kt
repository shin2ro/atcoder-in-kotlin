fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }

    xs.map { Math.min(it, Math.abs(it - k)) * 2 }
            .sum()
            .let { println(it) }
}
