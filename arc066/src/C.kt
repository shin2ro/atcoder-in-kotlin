fun main(args: Array<String>) {
    val mod = 1e9.toLong() + 7
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }

    val counters = IntArray(n)
    for (x in xs) {
        if (n % 2 == x % 2) {
            println(0)
            return
        }

        counters[x]++
        if (x == 0 && counters[x] > 1) {
            println(0)
            return
        }
        if (counters[x] > 2) {
            println(0)
            return
        }
    }

    var ans = 1L
    for (i in 0 until n / 2) {
        ans *= 2
        ans %= mod
    }
    println(ans)
}
