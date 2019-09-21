fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val graph = Array(n + 1) { BooleanArray(n + 1) { false } }
    repeat(m) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        graph[a][b] = true
        graph[b][a] = true
    }

    fun dfs(u: Int, i: Int, visited: BooleanArray): Int {

        visited[u] = true

        if (i == n) {
            return if (visited.all { it }) 1 else 0
        }

        return (1..n)
                .filter { !visited[it] && graph[u][it] }
                .map { dfs(it, i + 1 ,visited.clone()) }
                .sum()
    }

    val visited = BooleanArray(n + 1) { false }
    visited[0] = true

    println(dfs(1, 1, visited))
}
