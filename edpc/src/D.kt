fun main(args: Array<String>) {
    val (n, w) = readLine()!!.split(' ').map { it.toInt() }
    val dp = Array(n + 1) { LongArray(w + 1) }

    for (i in 0 until n) {
        val (wi, vi) = readLine()!!.split(' ').let { it[0].toInt() to it[1].toLong() }

        for (j in 0 until wi) {
            dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j])
        }
        for (j in wi..w) {
            dp[i + 1][j] = Math.max(dp[i][j - wi] + vi, dp[i][j])
        }
    }

    println(dp[n][w])
}
