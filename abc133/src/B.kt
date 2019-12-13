fun main(args: Array<String>) {
    val (n, d) = readLine()!!.split(' ').map { it.toInt() }
    val points = (0 until n).map { readLine()!!.split(' ').map { it.toInt() } }
    var ans = 0
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            val distance = (0 until d)
                    .map { Math.pow((points[i][it] - points[j][it]).toDouble(), 2.0) }
                    .sum()
                    .let { Math.sqrt(it) }
            if (distance == Math.floor(distance)) {
                ans++
            }
        }
    }
    println(ans)
}
