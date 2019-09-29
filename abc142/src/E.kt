fun main(args: Array<String>) {
    val inf = 10000000
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val keys = (0 until m).map {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        val c = readLine()!!.split(' ')
                .map { 1 shl (it.toInt() - 1) }
                .reduce { acc, i -> acc or i }
        a to c
    }

    val dp = Array(m + 1) { IntArray(4096) { inf } }
    dp[0][0] = 0

    for (i in 0 until m) {
        for (j in 0 until 4096) {
            dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j])
            val j2 = j or keys[i].second
            dp[i + 1][j2] = Math.min(dp[i + 1][j2], dp[i][j] + keys[i].first)
        }
    }

    dp[m][(1 shl n) - 1].let { println(if (it < inf) it else -1) }
}
