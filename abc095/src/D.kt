fun main(args: Array<String>) {
    val (n, c) = run {
        val s = readLine()!!.split(' ')
        s[0].toInt() to s[1].toLong()
    }

    val xs = LongArray(n) { 0 }
    val vs = LongArray(n) { 0 }

    val cum = LongArray(n + 1) { 0 }

    for (i in 0 until n) {
        val (x, v) = readLine()!!.split(' ').map { it.toLong() }
        xs[i] = x
        vs[i] = v
        cum[i + 1] = cum[i] + v
    }

    val r1 = run {
        val g = LongArray(n + 1) { 0 }
        for (i in 0 until n) {
            g[i + 1] = Math.max(g[i], cum[i + 1] - xs[i])
        }
        (0 until n).map {
            g[it] + cum.last() - cum[it] - (c - xs[it]) * 2
        }.max()!!.let {
            Math.max(it, g.last())
        }
    }

    val r2 = run {
        val g = LongArray(n + 1) { 0 }
        for (i in n - 1 downTo 0) {
            g[i] = Math.max(g[i + 1], cum.last() - cum[i] - (c - xs[i]))
        }
        (0 until n).map {
            g[it + 1] + cum[it + 1] - xs[it] * 2
        }.max()!!.let {
            Math.max(it, g.first())
        }
    }

    println(Math.max(r1, r2))
}
