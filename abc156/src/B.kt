fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    var x = n
    while (x > 0) {
        ans++
        x /= k
    }
    println(ans)
}
