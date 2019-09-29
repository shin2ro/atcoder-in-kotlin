fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toLong() }

    fun f(x: Long): Set<Long> {
        val set = mutableSetOf(1L)
        var t = x
        var i = 2L

        while (t > 1 && i * i < x) {
            if (t % i == 0L) {
                set.add(i)
                t /= i
                continue
            }
            i++
        }
        set.add(t)

        return set
    }

    println(f(a).intersect(f(b)).size)
}
