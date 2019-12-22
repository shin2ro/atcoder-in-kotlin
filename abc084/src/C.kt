fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val cs = IntArray(n)
    val ss = IntArray(n)
    val fs = IntArray(n)

    repeat(n - 1) {
        val (c, s, f) = readLine()!!.split(' ').map { it.toInt() }
        cs[it] = c
        ss[it] = s
        fs[it] = f
    }

    repeat(n) {
        var t = 0
        t += ss[it] + cs[it]
        for (i in it + 1 until n - 1) {
            if (t < ss[i]) t = ss[i]
            if (t % fs[i] != 0) t += fs[i] - t % fs[i]
            t += cs[i]
        }
        println(t)
    }

}
