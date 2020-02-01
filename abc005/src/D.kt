import java.io.PrintWriter

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val d = (0 until n).map { readLine()!!.split(' ').map { it.toInt() }.toIntArray() }.toTypedArray()

    val ds = Array(n + 1) { IntArray(n + 1) }
    for (i in 1..n) {
        for (j in 1..n) {
            ds[i][j] = d[i - 1][j - 1] + ds[i - 1][j] + ds[i][j - 1] - ds[i - 1][j - 1]
        }
    }

    val dp = IntArray(n * n + 1)
    for (i in 1..n) {
        for (j in 1..n) {
            for (i1 in i..n) {
                for (j1 in j..n) {
                    val sum = ds[i1][j1] - ds[i1 - i][j1] - ds[i1][j1 - j] + ds[i1 - i][j1 - j]
                    dp[i * j] = Math.max(sum, dp[i * j])
                }
            }
        }
    }

    for (i in 1..n * n) {
        dp[i] = Math.max(dp[i], dp[i - 1])
    }

    val pw = PrintWriter(System.out)
    val q = readLine()!!.toInt()
    repeat(q) {
        val p = readLine()!!.toInt()
        pw.println(dp[p])
    }
    pw.flush()
}
