fun main(args: Array<String>) {
    val n = readLine()!!.toLong()

    var ans = n - 1
    var i = 2L

    while (i * i <= n) {
        if (n % i == 0L) {
            ans = Math.min(ans, i + n / i - 2)
        }
        i++
    }

    println(ans)
}
