import java.util.*

fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val maze = (0 until h).map { readLine()!! }

    val dy = listOf(1, 0, -1, 0)
    val dx = listOf(0, 1, 0, -1)

    var ans = 0

    fun bfs(y: Int, x: Int): Int {
        var d = 0

        val queue = ArrayDeque<Triple<Int, Int, Int>>()
        val visited = Array(h) { BooleanArray(w) { false } }

        queue.addLast(Triple(y, x, 0))
        visited[y][x] = true

        while (queue.isNotEmpty()) {
            val p = queue.removeFirst()
            d = Math.max(d, p.third)

            for (i in 0 until 4) {
                val yi = p.first + dy[i]
                val xi = p.second + dx[i]

                if (yi !in 0 until h) continue
                if (xi !in 0 until w) continue
                if (maze[yi][xi] == '#') continue
                if (visited[yi][xi]) continue

                queue.addLast(Triple(yi, xi, p.third + 1))
                visited[yi][xi] = true
            }
        }

        return d
    }

    for (i in 0 until h)
        for (j in 0 until w) {
            if (maze[i][j] == '#') continue
            ans = Math.max(ans, bfs(i, j))
        }

    println(ans)
}
