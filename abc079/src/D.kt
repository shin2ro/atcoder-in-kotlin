fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val costs = (0..9).map {
        readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    }.toTypedArray()
    val wall = (0 until h).map {
        readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    }.toTypedArray()

    for (k in 0..9) {
        for (i in 0..9) {
            for (j in 0..9) {
                costs[i][j] = Math.min(costs[i][j], costs[i][k] + costs[k][j])
            }
        }
    }

    var ans = 0

    for (i in 0 until h) {
        for (j in 0 until w) {
            if (wall[i][j] != -1) {
                ans += costs[wall[i][j]][1]
            }
        }
    }

    println(ans)
}
