fun main(args: Array<String>) {
    val inf = 1e9.toInt()
    val (h, n) = readLine()!!.split(' ').map { it.toInt() }
    val ms = (0 until n).map {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        a to b
    }

    val dp = IntArray(2e4.toInt() + 1) { inf }
    dp[0] = 0

    for (i in 0..h) {
        for (m in ms) {
            val j = i + m.first
            dp[j] = Math.min(dp[i] + m.second, dp[j])
        }
    }

    println(dp.slice(h..dp.lastIndex).min())
}
