import java.io.PrintWriter

fun main(args: Array<String>) {
    val inf = 1e13.toLong()
    val pw = PrintWriter(System.out)

    val (n, m, l) = readLine()!!.split(' ').map { it.toInt() }

    val d1 = Array(n + 1) { LongArray(n + 1) { inf } }
    val d2 = Array(n + 1) { LongArray(n + 1) { inf } }
    for (i in 1 until n) {
        d1[i][i] = 0
        d2[i][i] = 0
    }
    repeat(m) {
        val (a, b, c) = readLine()!!.split(' ').map { it.toInt() }
        c.toLong().let{
            d1[a][b] = it
            d1[b][a] = it
        }
    }

    for (k in 1 .. n)
        for (i in 1 .. n)
            for (j in 1 .. n) {
                d1[i][j] = Math.min(d1[i][j], d1[i][k] + d1[k][j])
            }

    for (i in 1 .. n)
        for (j in 1 .. n) {
            if (d1[i][j] <= l) {
                d2[i][j] = Math.min(d2[i][j], 1)
            }
        }

    for (k in 1 .. n)
        for (i in 1 .. n)
            for (j in 1 .. n) {
                d2[i][j] = Math.min(d2[i][j], d2[i][k] + d2[k][j])
            }

    val q = readLine()!!.toInt()
    repeat(q) {
        val (s, t) = readLine()!!.split(' ').map { it.toInt() }
        pw.println(if (d2[s][t] < inf) d2[s][t] - 1 else -1)
    }
    pw.flush()
}
