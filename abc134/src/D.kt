fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    val ys = IntArray(n)
    val ans = mutableListOf<Int>()

    for (i in n - 1 downTo 0) {
        val s = (i until n step (i + 1)).map { ys[it] }.sum()
        if (s % 2 != xs[i]) {
            ys[i]++
            ans.add(i + 1)
        }
    }

    println(ans.size)
    ans.joinToString(" ").let { println(it) }
}
