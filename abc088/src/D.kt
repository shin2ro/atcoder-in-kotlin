import java.util.*

fun main(args: Array<String>) {
    val inf = Int.MAX_VALUE

    val di = listOf(-1, 0, 1, 0)
    val dj = listOf(0, 1, 0, -1)

    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val grid = (0 until h).map { readLine()!! }.toTypedArray()
    val cnt = grid.map { it.count { c -> c == '.' } }.sum()

    val queue = ArrayDeque<Pair<Int, Int>>()
    val visited = Array(h) { IntArray(w) { inf } }

    queue.addLast(0 to 0)
    visited[0][0] = 1

    while (queue.isNotEmpty()) {
        val (i, j) = queue.removeFirst()
        val v = visited[i][j]

        repeat(4) {
            val ni = i + di[it]
            val nj = j + dj[it]
            if (ni !in 0 until h) return@repeat
            if (nj !in 0 until w) return@repeat
            if (grid[ni][nj] == '#') return@repeat
            if (visited[ni][nj] != inf) return@repeat

            visited[ni][nj] = v + 1
            queue.addLast(ni to nj)
        }
    }

    println(visited[h - 1][w - 1].let { if (it != inf) cnt - it else -1 })
}
