fun main(args: Array<String>) {
    val (n, q) = readLine()!!.split(' ').map { it.toInt() }
    val ans = IntArray(n) { 0 }
    repeat(q) {
        val (l, r, t) = readLine()!!.split(' ').map { it.toInt() }
        for (i in l - 1 until r) {
            ans[i] = t
        }
    }
    ans.forEach { println(it) }
}
