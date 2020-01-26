fun main(args: Array<String>) {
    val inf = 1e9.toInt()
    val (h, n) = readLine()!!.split(' ').map { it.toInt() }
    val ms = (0 until n).map {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        a to b
    }

    val ans = IntArray(h + 1) { inf }
    ans[h] = 0

    for (i in h - 1 downTo 1) {
        for (m in ms) {
            val j = i + m.first
            if (j > h) continue
            ans[i] = Math.min(ans[j] + m.second, ans[i])
        }
    }

    for (m in ms) {
        val j = m.first
        ans[0] = Math.min(ans.slice(1..j).min()!! + m.second, ans[0])
    }

    println(ans[0])
}
