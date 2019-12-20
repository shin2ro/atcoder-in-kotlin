fun main(args: Array<String>) {
    val mod = 1e9.toLong() + 7
    val n = readLine()!!.toInt()

    val fs = IntArray(n + 1)

    for (i in 2..n) {
        var x = i
        for (j in 2..i) {
            while (x % j == 0) {
                fs[j]++
                x /= j
            }
        }
    }

    var ans = 1L
    for (i in 2..n) {
        if (fs[i] > 0) {
            ans *= fs[i] + 1
            ans %= mod
        }
    }
    println(ans)
}
