fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = (0 until n).map {
        val a = readLine()!!.toInt()
        (0 until a).map {
            val (x, y) = readLine()!!.split(' ').map { it.toInt() }
            x - 1 to y
        }
    }

    var ans = 0

    fun dfs(array: IntArray) {
        if (array.size == n) {
            for (i in 0 until n) {
                if (array[i] == 0) continue
                if (!xs[i].all { it.second == array[it.first] }) {
                    return
                }
            }
            ans = Math.max(ans, array.sum())
            return
        }
        dfs(array.plus(0))
        dfs(array.plus(1))
    }

    dfs(IntArray(0))

    println(ans)
}
