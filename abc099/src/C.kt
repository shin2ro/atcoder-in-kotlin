fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val dp = IntArray(n + 1)

    for (i in 1..n) {
        dp[i] = 1 + dp[i - 1]

        var j = 6
        while (j <= i) {
            dp[i] = Math.min(1 + dp[i - j], dp[i])
            j *= 6
        }

        j = 9
        while (j <= i) {
            dp[i] = Math.min(1 + dp[i - j], dp[i])
            j *= 9
        }
    }

    println(dp[n])
}
