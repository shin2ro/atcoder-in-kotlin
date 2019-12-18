fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val xs = readLine()!!.split(' ').map { it.toInt() }
    var ans = Int.MAX_VALUE
    for (i in 0 until n - k + 1) {
        val l = xs[i]
        val r = xs[i + k - 1]
        if (r <= 0) {
            ans = Math.min(ans, -l)
            continue
        }
        if (l >= 0) {
            ans = Math.min(ans, r)
            continue
        }
        ans = Math.min(ans, -l + r + Math.min(-l, r))
    }
    println(ans)
}
