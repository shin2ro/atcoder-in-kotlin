fun main(args: Array<String>) {
    val inf = 1e9.toLong() * 1e9.toLong()
    val (n, k) = readLine()!!.split(' ').let { it[0].toInt() to it[1].toLong() }
    val a = readLine()!!.split(' ').map { it.toLong() }.sorted().toLongArray()

    fun f(x: Long): Long {
        var cnt = 0L

        for (i in 0 until n) {
            var c = 0
            var l = i + 1
            var r = n - 1

            while (l <= r) {
                val m = (l + r) / 2

                if (a[i] < 0) {
                    if (a[i] * a[m] < x) {
                        r = m - 1
                        c = n - m
                    } else {
                        l = m + 1
                    }
                } else {
                    if (a[i] * a[m] < x) {
                        l = m + 1
                        c = m - i
                    } else {
                        r = m - 1
                    }
                }
            }

            cnt += c
        }

        return cnt
    }

    var ans = -inf
    var l = -inf
    var r = inf
    while (l <= r) {
        val m = (l + r) / 2
        if (f(m) < k) {
            ans = m
            l = m + 1
        } else {
            r = m - 1
        }
    }

    println(ans)
}
