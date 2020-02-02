import java.io.PrintWriter

fun main(args: Array<String>) {
    val (l, h) = readLine()!!.split(' ').map { it.toInt() }
    val n = readLine()!!.toInt()
    val pw = PrintWriter(System.out)
    repeat(n) {
        val a = readLine()!!.toInt()
        val ans = when {
            a < l -> l - a
            a > h -> -1
            else -> 0
        }
        pw.println(ans)
    }
    pw.flush()
}
