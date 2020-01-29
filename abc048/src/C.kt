fun main(args: Array<String>) {
    val (n, x) = readLine()!!.split(' ').let { it[0].toInt() to it[1].toLong() }
    val a = readLine()!!.split(' ').map { it.toLong() }
    val b = LongArray(n)
    b[0] = Math.min(a[0], x)
    for (i in 1 until n) {
        b[i] = a[i] - Math.max(b[i - 1] + a[i] - x, 0)
    }
    println((0 until n).map { a[it] - b[it] }.sum())
}
