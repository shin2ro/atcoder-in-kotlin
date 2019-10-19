import java.io.PrintWriter

fun main(args: Array<String>) {
    val pw = PrintWriter(System.out)

    val (n, q) = readLine()!!.split(' ').map { it.toInt() }

    val u = IntArray(n - 1)
    val v = IntArray(n - 1)
    val cnt = IntArray(n)
    repeat(n - 1) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() - 1 }
        u[it] = a
        v[it] = b
        cnt[a]++
        cnt[b]++
    }

    val graph = Array(n) { IntArray(0) }
    repeat(n) {
        graph[it] = IntArray(cnt[it])
    }
    repeat(n - 1) {
        val a = u[it]
        val b = v[it]
        graph[a][--cnt[a]] = b
        graph[b][--cnt[b]] = a
    }

    val counters = IntArray (n) { 0 }
    repeat(q) {
        val (p, x) = readLine()!!.split(' ').map { it.toInt() }
        counters[p - 1] += x
    }

    val ans = IntArray (n) { 0 }
    val visited = BooleanArray (n) { false }
    visited[0] = true

    fun dfs(v: Int, counter: Int) {
        visited[v] = true
        ans[v] = counter + counters[v]
        graph[v].forEach {
            if (visited[it]) {
                return@forEach
            }
            dfs(it, ans[v])
        }
    }

    dfs(0, 0)

    pw.print(ans[0])
    for (i in (1 until ans.size)) {
        pw.print(" ${ans[i]}")
    }
    pw.println()
    pw.flush()
}
