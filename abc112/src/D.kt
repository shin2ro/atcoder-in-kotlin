fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toLong() }
    var ans = 0L
    var i = 1L
    while (i * i <= m) {
        if (m % i == 0L) {
            for (d in arrayOf(i, m / i)) {
                if (m >= n * d) {
                    ans = Math.max(ans, d)
                }
            }
        }
        i++
    }
    println(ans)
}
