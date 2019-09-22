fun main(args: Array<String>) {
    val (w, h, n) = readLine()!!.split(' ').map { it.toInt() }
    val grid = Array(h) { IntArray(w) { 1 } }
    repeat(n) {
        val (xi, yi, a) = readLine()!!.split(' ').map { it.toInt() }
        when (a) {
            1 -> {
                for (y in 0 until h) {
                    for (x in 0 until xi) {
                        grid[y][x] = 0
                    }
                }
            }
            2 -> {
                for (y in 0 until h) {
                    for (x in xi until w) {
                        grid[y][x] = 0
                    }
                }
            }
            3 -> {
                for (y in 0 until yi) {
                    for (x in 0 until w) {
                        grid[y][x] = 0
                    }
                }
            }
            4 -> {
                for (y in yi until h) {
                    for (x in 0 until w) {
                        grid[y][x] = 0
                    }
                }
            }
            else -> {}
        }
    }
    println(grid.sumBy { it.sum() })
}
