import java.util.*

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val edges = Array<Pair<Int, Int>>(m) { 0 to 0 }
    val graph = Array(n + 1) { mutableListOf<Int>() }

    repeat(m) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        edges[it] = a to b
        graph[a].add(b)
        graph[b].add(a)
    }

    var ans = 0

    for (edge in edges) {

        val visited = BooleanArray(n + 1) { false }
        val stack = ArrayDeque<Int>()

        visited[edge.first] = true
        stack.addFirst(edge.first)

        while (stack.isNotEmpty()) {
            val v = stack.removeFirst()
            for (u in graph[v]) {
                if (v == edge.first && u == edge.second) continue
                if (visited[u]) continue
                visited[u] = true
                stack.push(u)
            }
        }

        if (!visited[edge.second]) ans++
    }

    println(ans)
}
