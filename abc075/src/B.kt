fun main(args: Array<String>) {
    val di = listOf(-1, -1, 0, 1, 1, 1, 0, -1)
    val dj = listOf(0, 1, 1, 1, 0, -1, -1, -1)

    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val grid = (0 until h).map { readLine()!! }

    val ans = (0 until h).map { grid[it].toCharArray() }

    for (i in 0 until h) {
        for (j in 0 until w) {
            if (grid[i][j] == '#') continue

            var cnt = 0
            for (k in 0 until 8) {
                val ni = i + di[k]
                val nj = j + dj[k]

                if (ni !in 0 until h) continue
                if (nj !in 0 until w) continue

                if (grid[ni][nj] == '#') cnt++
            }
            ans[i][j] = cnt.toString()[0]
        }
    }

    ans.forEach { println(it.joinToString("")) }
}
