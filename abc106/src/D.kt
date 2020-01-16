import java.io.PrintWriter

fun main(args: Array<String>) {
    val (n, m, q) = readLine()!!.split(' ').map { it.toInt() }
    val t = Array(n + 1) { IntArray(n + 1) }
    repeat(m) {
        val (l, r) = readLine()!!.split(' ').map { it.toInt() }
        t[l][r]++
    }

    for (i in 1..n) {
        for (j in 1..n) {
            t[i][j] += t[i - 1][j] + t[i][j - 1] - t[i - 1][j - 1]
        }
    }

    val pw = PrintWriter(System.out)
    repeat(q) {
        val (l, r) = readLine()!!.split(' ').map { it.toInt() }
        pw.println(t[r][r] - t[l - 1][r] - t[r][l - 1] + t[l - 1][l - 1])
    }
    pw.flush()
}
