fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val fs = mutableMapOf<Long, Long>()

    for (i in 1L..n) {
        var y = i
        var x = 2L
        while (x * x <= i) {
            if (y % x == 0L) {
                fs[x] = (fs[x] ?: 0) + 1
                y /= x
                continue
            }
            x++
        }
        if (y > 1) fs[y] = (fs[y] ?: 0) + 1
    }

    var ans = 0

    // 75 * 1
    ans += fs.filter { it.value >= 74 }.count()
    // 25 * 3
    ans += fs.filter { it.value >= 24 }.count() * fs.filter { it.value >= 2 }.count().let { it - 1 }
    // 15 * 5
    ans += fs.filter { it.value >= 14 }.count() * fs.filter { it.value >= 4 }.count().let { it - 1 }
    // 5 * 5 * 3
    ans += fs.filter { it.value >= 4 }.count().let { it * (it - 1) / 2 } * fs.filter { it.value >= 2 }.count().let { it - 2 }

    println(ans)
}
