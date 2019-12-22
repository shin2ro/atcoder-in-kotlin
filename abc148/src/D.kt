fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }
    var x = 1
    var ans = 0
    for (i in 0 until n) {
        if (xs[i] == x) {
            x++
            continue
        }
        ans++
    }
    println(if (ans < n) ans else -1)
}
