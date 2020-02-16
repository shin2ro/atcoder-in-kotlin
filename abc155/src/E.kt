fun main(args: Array<String>) {
    val s = readLine()!!
    val n = s.length

    val t = Array(2) { LongArray(n) { Long.MAX_VALUE } }

    t[0][0] = (s.last() - '0').toLong()
    t[1][0] = 10L - (s.last() - '0')

    for (i in 1 until n) {
        val x1 = s[s.lastIndex - i] - '0'
        val x2 = x1 + 1

        t[0][i] = Math.min(t[0][i - 1] + x1, t[1][i - 1] + x2)
        t[1][i] = Math.min(t[0][i - 1] + (10 - x1), t[1][i - 1] + (10 - x2))
    }

    println(Math.min(t[0][s.lastIndex], t[1][s.lastIndex] + 1))
}
