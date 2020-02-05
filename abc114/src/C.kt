fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    fun dfs(x: Long, is7: Boolean = false, is5: Boolean = false, is3: Boolean = false): Int {
        if (x > n) {
            return 0
        }
        var r = 0
        if (is7 && is5 && is3) {
            r++
        }
        r += dfs(x * 10 + 7, true, is5, is3)
        r += dfs(x * 10 + 5, is7, true, is3)
        r += dfs(x * 10 + 3, is7, is5, true)
        return r
    }

    println(dfs(0))
}
