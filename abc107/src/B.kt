fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val grid = (0 until h).map { readLine()!! }.toTypedArray()
    val hs = (0 until h).toMutableSet()
    val ws = (0 until w).toMutableSet()

    for (i in 0 until h) {
        if (grid[i].all { it == '.' }) {
            hs.remove(i)
        }
    }

    for (i in 0 until w) {
        if (grid.map { it[i] }.all { it == '.' }) {
            ws.remove(i)
        }
    }

    grid.slice(hs.asIterable()).forEach { println(it.slice(ws.asIterable())) }
}
