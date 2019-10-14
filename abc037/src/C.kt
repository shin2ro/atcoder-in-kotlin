fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val xs = readLine()!!.split(' ').map { it.toLong() }
    val s = LongArray(n + 1) { 0L }
    xs.forEachIndexed { i, l ->
        s[i + 1] = s[i] + l
    }
    (k .. n).map { s[it] - s[it - k] }.sum().let { println(it) }
}
