fun main(args: Array<String>) {
    val maxW = readLine()!!.toInt()
    val (n, maxK) = readLine()!!.split(' ').map { it.toInt() }

    val weights = IntArray(n)
    val values = IntArray(n)

    repeat(n) { i ->
        val (w, v) = readLine()!!.split(' ').map { it.toInt() }
        weights[i] = w
        values[i] = v
    }

    val dp = Array(n + 1) { Array(maxK + 1) { IntArray(maxW + 1) } }

    for (i in 0 until n) {
        for (k in 1..maxK) {
            for (w in 0..maxW) {
                if (w >= weights[i]) {
                    dp[i + 1][k][w] = Math.max(dp[i][k][w], dp[i][k - 1][w - weights[i]] + values[i])
                } else {
                    dp[i + 1][k][w] = dp[i][k][w]
                }
            }
        }
    }

    println(dp[n][maxK][maxW])
}
