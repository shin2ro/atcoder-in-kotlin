fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toLong() }

    fun f(h: Long, w: Long): Long {
        var ans = Long.MAX_VALUE
        for (h1 in 1 until h) {
            val h2 = h - h1

            val a = listOf(h1 * w, (h2 / 2) * w, (h2 - h2 / 2) * w)
            ans = Math.min(ans, a.max()!! - a.min()!!)

            val b = listOf(h1 * w, h2 * (w / 2), h2 * (w - w / 2))
            ans = Math.min(ans, b.max()!! - b.min()!!)
        }
        return ans
    }

    println(Math.min(f(h, w), f(w, h)))
}
