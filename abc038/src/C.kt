fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0L
    var l = 0
    var r = 1
    while (l < n) {
        if (r < n && a[r - 1] < a[r]) {
            r++
            continue
        }

        ans += r - l
        l++

        if (l == r) {
            r++
        }
    }
    println(ans)
}
