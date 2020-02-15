fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val w = (0 until m).map { readLine()!!.toInt() }
    val t = IntArray(n + 1) { -1 }
    var cur = 0
    for (i in w.reversed()) {
        if (t[i] < 0) t[i] = cur++
    }
    for (i in 1..n) {
        if (t[i] < 0) t[i] = cur++
    }
    val ans = IntArray(n)
    for (i in 1..n) {
        ans[t[i]] = i
    }
    println(ans.joinToString("\n"))
}
