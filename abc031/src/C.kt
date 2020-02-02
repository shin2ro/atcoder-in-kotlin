fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }

    var ans = Int.MIN_VALUE

    for (i in 0 until n) {

        var t = Int.MIN_VALUE
        var ma = Int.MIN_VALUE

        for (j in 0 until n) {
            if (i == j) continue

            var pt = 0
            var pa = 0

            a.slice(Math.min(i, j)..Math.max(i, j))
                    .forEachIndexed { index, x ->
                        if (index % 2 == 0) pt += x else pa += x
                    }

            if (pa > ma) {
                ma = pa
                t = pt
            }
        }

        ans = Math.max(ans, t)
    }

    println(ans)
}
