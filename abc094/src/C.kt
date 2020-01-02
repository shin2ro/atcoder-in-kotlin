import java.io.PrintWriter

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }
    val (m1, m2) = xs.sorted().slice(arrayOf(n / 2 - 1, n / 2).asIterable())
    val pw = PrintWriter(System.out)
    xs.forEach {
        if (it < m2) {
            pw.println(m2)
        } else {
            pw.println(m1)
        }
    }
    pw.flush()
}
