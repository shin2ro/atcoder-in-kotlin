fun main(args: Array<String>) {
    val (n, a, b) = readLine()!!.split(' ').map { it.toInt() }
    val ans = (1..n).filter {
        var x = it
        var y = 0
        while (x > 0) {
            y += x % 10
            x /= 10
        }
        y in a..b
    }.sum()
    println(ans)
}
