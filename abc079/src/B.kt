fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val memo = LongArray(n + 1) { 0 }
    memo[0] = 2L
    memo[1] = 1L

    fun f(i: Int): Long {
        if (memo[i] != 0L) return memo[i]
        memo[i] = f(i - 1) + f(i - 2)
        return memo[i]
    }

    println(f(n))
}
