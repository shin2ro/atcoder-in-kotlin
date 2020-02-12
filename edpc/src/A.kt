fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val h = readLine()!!.split(' ').map { it.toInt() }
    val dp = IntArray(n) { Int.MAX_VALUE }
    dp[0] = 0
    dp[1] = Math.abs(h[1] - h[0])
    for (i in 2 until n) {
        dp[i] = Math.min(dp[i - 2] + Math.abs(h[i - 2] - h[i]), dp[i - 1] + Math.abs(h[i - 1] - h[i]))
    }
    println(dp[n - 1])
}
