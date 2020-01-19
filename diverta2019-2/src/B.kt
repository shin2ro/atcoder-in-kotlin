fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val balls = (0 until n).map {
        readLine()!!.split(' ').map { it.toInt() }.let { it[0] to it[1] }
    }

    fun f(p: Int, q: Int): Int {
        var cnt = 0
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (i == j) continue
                val x = balls[i].first - balls[j].first
                val y = balls[i].second - balls[j].second
                if (x == p && y == q) cnt++
            }
        }
        return cnt
    }

    var ans = 0

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) continue
            val p = balls[i].first - balls[j].first
            val q = balls[i].second - balls[j].second
            ans = Math.max(f(p, q), ans)
        }
    }

    println(n - ans)
}
