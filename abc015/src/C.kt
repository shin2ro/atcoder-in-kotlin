fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val ts = (0 until n).map {
        readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    }.toTypedArray()

    fun dfs(v: Int, cur: Int): Boolean {
        if (cur == n) {
            return v == 0
        }
        for (i in 0 until k) {
            if (dfs(v xor ts[cur][i], cur + 1)) return true
        }
        return false
    }

    println(if (dfs(0, 0)) "Found" else "Nothing")
}
