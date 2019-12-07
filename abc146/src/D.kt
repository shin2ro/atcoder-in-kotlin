import java.io.PrintWriter
import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val g = Array(n + 1) { mutableMapOf<Int, Int>() }
    val edges = (1 until n).map {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        g[a][b] = 0
        g[b][a] = 0
        a to b
    }

    var k = 0
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.addLast(1 to 0)

    while (queue.isNotEmpty()) {
        val (current, parent) = queue.removeFirst()
        var c = 0
        for (v in g[current]) {
            if (v.key == parent) continue
            c++
            if (c == g[current][parent]) c++
            if (c > k) {
                k = c
            }
            g[current][v.key] = c
            g[v.key][current] = c
            queue.addLast(v.key to current)
        }
    }

    val pw = PrintWriter(System.out)
    pw.println(k)
    edges.forEach { pw.println(g[it.first][it.second]) }
    pw.flush()
}
