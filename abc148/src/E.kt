fun main(args: Array<String>) {
    var n = readLine()!!.toLong()
    if (n % 2 == 1L) {
        println(0)
        return
    }
    var ans = 0L
    while (n > 0) {
        ans += n / 5 / 2
        n /= 5
    }
    println(ans)
}
