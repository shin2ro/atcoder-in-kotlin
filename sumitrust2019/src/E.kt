fun main(args: Array<String>) {
    val mod = 1000000007L
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    val colors = IntArray(3)
    var ans = 1L
    for (i in 0 until n) {
        val x = colors.filter { it == a[i] }.count()
        ans *= x
        ans %= mod
        for (j in 0 until 3) {
            if (colors[j] == a[i]) {
                colors[j]++
                break
            }
        }
    }
    println(ans)
}
