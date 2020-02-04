fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val vs = readLine()!!.split(' ').map { it.toInt() }

    var ans = Int.MIN_VALUE

    for (i in 0..Math.min(n, k)) {
        for (j in 0..Math.min(n, k) - i) {
            val xs = vs.take(i).plus(vs.takeLast(j))
            val v = xs.sum() - xs.filter { it < 0 }.sorted().take(k - i - j).sum()
            ans = Math.max(ans, v)
        }
    }

    println(ans)
}
