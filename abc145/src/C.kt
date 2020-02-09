fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val ps = (0 until n).map {
        val (x, y) = readLine()!!.split(' ').map { it.toDouble() }
        x to y
    }

    fun dfs(indices: List<Int>): Double {
        if (indices.size == n) {
            var d = 0.0
            for (i in 1 until n) {
                val p1 = ps[indices[i - 1]]
                val p2 = ps[indices[i]]
                d += Math.sqrt(Math.pow(p1.first - p2.first, 2.0) + Math.pow(p1.second - p2.second, 2.0))
            }
            return d
        }

        var d = 0.0

        for (i in 0 until n) {
            if (indices.contains(i)) continue
            d +=  dfs(indices + i)
        }

        return d
    }

    fun fact(n: Int): Int {
        if (n == 1) return 1
        return n * fact(n - 1)
    }

    println(dfs(emptyList()) / fact(n))
}
