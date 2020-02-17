fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val dp = Array(n + 1) { LongArray(3) }

    for (i in 0 until n) {
        val xs = readLine()!!.split(' ').map { it.toLong() }
        for (j in 0 until 3) {
            dp[i + 1][j] = Math.max(dp[i][(j + 1) % 3] + xs[j], dp[i][(j + 2) % 3] + xs[j])
        }
    }

    println(dp[n].max())
}
