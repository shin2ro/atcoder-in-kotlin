import java.io.PrintWriter

fun main(args: Array<String>) {
    val (n, m, q) = readLine()!!.split(' ').map { it.toInt() }
    val t = Array(n + 1) { IntArray(n + 1) }
    repeat(m) {
        val (l, r) = readLine()!!.split(' ').map { it.toInt() }
        for (i in 1..l)
            for (j in r..n)
                t[i][j]++
    }
    val pw = PrintWriter(System.out)
    repeat(q) {
        val (l, r) = readLine()!!.split(' ').map { it.toInt() }
        pw.println(t[l][r])
    }
    pw.flush()
}
