fun main(args: Array<String>) {

    fun pow(n: Int, e: Int): Int {
        return (0 until e).fold(1) { acc, i -> acc * n }
    }

    fun comb(n: Int, k: Int): Int {
        if (k !in (0..n)) return 0
        var r = n
        repeat(k - 1) { r *= n - it - 1 }
        repeat(k - 1) { r /= k - it }
        return r
    }

    val s = readLine()!!
    val k = readLine()!!.toInt()
    val n = s.length

    fun f(i: Int, k: Int, small: Boolean): Int {
        if (i == n) {
            if (k == 0) return 1
            return 0
        }

        if (k == 0) return 1

        if (small) return comb(n - i, k) * pow(9, k)

        if (s[i] == '0') return f(i + 1, k, false)

        return f(i + 1, k, true) +
                f(i + 1, k - 1, true) * (s[i] - '1') +
                f(i + 1, k - 1, false)
    }

    println(f(0, k, false))
}
