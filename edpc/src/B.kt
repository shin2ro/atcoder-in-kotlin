fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val h = readLine()!!.split(' ').map { it.toInt() }
    val dp = IntArray(n) { Int.MAX_VALUE }
    dp[0] = 0
    for (i in 0 until n) {
        for (j in 1..Math.min(k, n - i - 1)) {
            dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(h[i] - h[i + j]))
        }
    }
    println(dp[n - 1])
}
