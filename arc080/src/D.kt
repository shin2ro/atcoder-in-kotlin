fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }

    val ans = Array(h) { IntArray(w) }

    var cur = 0
    var cnt = 0

    for (i in 0 until h) {
        val range = if (i % 2 == 0) {
            0 until w
        } else {
            w - 1 downTo 0
        }
        for (j in range) {
            if (a[cur] == cnt) {
                cur++
                cnt = 0
            }
            ans[i][j] = cur + 1
            cnt++
        }
    }

    ans.forEach { println(it.joinToString(" ")) }
}
