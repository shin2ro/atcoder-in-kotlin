fun main(args: Array<String>) {
    val h = readLine()!!.toLong()
    var h1 = h
    var cnt = 0
    while (h1 > 1) {
        cnt++
        h1 /= 2
    }
    println((0..cnt).fold(0L) { acc, i -> acc + Math.pow(2.0, i.toDouble()).toLong() })
}
