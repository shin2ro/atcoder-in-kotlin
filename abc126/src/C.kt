fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0.0
    for (i in 1..n) {
        var p = 1.0 / n
        var x = i
        while (x < k) {
            p *= 0.5
            x *= 2
        }
        ans += p
    }
    println(ans)
}
