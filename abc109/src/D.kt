fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }

    val grid = (0 until h).map {
        readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    }.toTypedArray()

    val ops = mutableListOf<Pair<Pair<Int, Int>, Pair<Int, Int>>>()

    for (i in 0 until h) {
        for (j in 0 until w - 1) {
            if (grid[i][j] % 2 == 1) {
                grid[i][j] -= 1
                grid[i][j + 1] +=1
                ops.add((i + 1 to j + 1) to (i + 1 to j + 2))
            }
        }
        if (i < h - 1 && grid[i][w - 1] % 2 == 1) {
            grid[i][w - 1] -= 1
            grid[i + 1][w - 1] +=1
            ops.add((i + 1 to w) to (i + 2 to w))
        }
    }

    println(ops.size)
    ops.forEach { println("${it.first.first} ${it.first.second} ${it.second.first} ${it.second.second}") }
}
