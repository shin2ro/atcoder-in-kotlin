fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val p = readLine()!!.split(' ').map { it.toDouble() }
    val e = p.map { (it + 1) / 2 }
    val s = DoubleArray(n + 1)
    for (i in 1..n) {
        s[i] = s[i - 1] + e[i - 1]
    }
    var ans = 0.0
    for (i in 0..n-k) {
        ans = Math.max(ans, s[i + k] - s[i])
    }
    println(ans)
}
