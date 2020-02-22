fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toLong() }

    var min = Long.MAX_VALUE

    for (p in 1L..100L) {
        min = Math.min(xs.map { x -> (x - p).let { it * it } }.sum(), min)
    }

    println(min)
}
