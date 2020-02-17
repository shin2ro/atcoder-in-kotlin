fun main(args: Array<String>) {
    val (n, w) = readLine()!!.split(' ').map { it.toInt() }
    val inf = 1e9.toLong() + 1
    val dp = Array(n + 1) { LongArray(100001) { inf } }
    dp[0][0] = 0

    for (i in 0 until n) {
        val (wi, vi) = readLine()!!.split(' ').let { it[0].toLong() to it[1].toInt() }

        for (j in 0 until vi) {
            dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j])
        }
        for (j in vi..100000) {
            dp[i + 1][j] = Math.min(dp[i][j - vi] + wi, dp[i][j])
        }
    }

    println(dp[n].mapIndexed { i, l -> if (l <= w) i else -1 }.max())
}
