fun main(args: Array<String>) {
    val mod = (1e9 + 7).toLong()
    val n = readLine()!!.toLong()
    val xs = readLine()!!.split(' ').map { it.toLong() }

    var ans = 0L

    for (i in 0 until 60) {
        val a = xs.map { (it shr i) and 1 }.sum()
        val b = n - a
        ans += ((a * b) % mod) * ((1L shl i) % mod) % mod
        ans %= mod
    }

    println(ans)
}
