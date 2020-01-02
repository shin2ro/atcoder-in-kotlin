fun main(args: Array<String>) {
    val n = readLine()!!.toLong()

    fun f(a: Long, b: Long): Int {
        return Math.max(a.toString().length, b.toString().length)
    }

    var ans = Int.MAX_VALUE
    var i = 1L
    while (i * i <= n) {
        if (n % i == 0L) {
            val a = i
            val b = n / a
            ans = Math.min(ans, f(a, b))
        }
        i++
    }
    println(ans)
}
