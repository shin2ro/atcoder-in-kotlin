fun main(args: Array<String>) {
    val (n, c) = readLine()!!.split(' ').map { it.toInt() }
    val d = (0 until c)
            .map { readLine()!!.split(' ').map { it.toInt() }.toIntArray() }
            .toTypedArray()
    val t = Array(3) { IntArray(c) }
    repeat(n) { i ->
        readLine()!!
                .split(' ')
                .map { it.toInt() }
                .forEachIndexed { j, x ->
                    t[(i + j) % 3][x - 1]++
                }
    }

    var ans = Int.MAX_VALUE

    for (i in 0 until c) {
        for (j in 0 until c) {
            if (i == j) continue
            for (k in 0 until c) {
                if (i == k || j == k) continue

                var x = 0

                x += (0 until c).map { d[it][i] * t[0][it] }.sum()
                x += (0 until c).map { d[it][j] * t[1][it] }.sum()
                x += (0 until c).map { d[it][k] * t[2][it] }.sum()

                ans = Math.min(x, ans)
            }
        }
    }

    println(ans)
}
