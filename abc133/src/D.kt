fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }
    val ans = IntArray(n)
    ans[0] = xs.mapIndexed { i, x -> if (i % 2 == 0) x else -x }.sum() / 2
    for (i in 1 until n) {
        ans[i] = xs[i - 1] - ans[i - 1]
    }
    println(ans.map { it * 2 }.joinToString(" "))
}
