fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val ds = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            ans += ds[i] * ds[j]
        }
    }
    println(ans)
}
