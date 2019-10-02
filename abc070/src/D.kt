import java.io.PrintWriter

fun main(args: Array<String>) {
    val pw = PrintWriter(System.out)
    val n = readLine()!!.toInt()
    val tree = mutableMapOf<Int, MutableList<Pair<Int, Long>>>()
    repeat(n - 1) {
        val s = readLine()!!.split(' ')
        val a = s[0].toInt()
        val b = s[1].toInt()
        val c = s[2].toLong()

        tree.getOrPut(a) { mutableListOf() }.add(b to c)
        tree.getOrPut(b) { mutableListOf() }.add(a to c)
    }

    val visited = BooleanArray(n + 1) { false }
    val costs = LongArray(n + 1) { 0L }

    fun dfs(v: Int, cost: Long) {
        visited[v] = true
        costs[v] = cost
        for ((u, c) in tree.getOrElse(v) { emptyList<Pair<Int, Long>>() }) {
            if (visited[u]) {
                continue
            }
            dfs(u, cost + c)
        }
    }

    val (q, k) = readLine()!!.split(' ').map { it.toInt() }

    dfs(k, 0)

    repeat(q) {
        val (x, y) = readLine()!!.split(' ').map { it.toInt() }
        pw.println(costs[x] + costs[y])
    }

    pw.flush()
}
