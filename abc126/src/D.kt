fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val graph = Array(n + 1) { mutableListOf<Pair<Int, Int>>() }

    repeat(n - 1) {
        val (u, v, w) = readLine()!!.split(' ').map { it.toInt() }
        graph[u].add(v to w)
        graph[v].add(u to w)
    }

    val ans = IntArray(n + 1)

    fun dfs(u: Int, d: Int, p: Int) {
        for ((v, w) in graph[u]) {
            if (v == p) continue
            ans[v] = (d + w) % 2
            dfs(v, ans[v], u)
        }
    }

    dfs(1, 0, 0)

    println(ans.slice(1..n).joinToString("\n"))
}
