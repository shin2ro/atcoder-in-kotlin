fun main(args: Array<String>) {
    val (n, l) = readLine()!!.split(' ').map { it.toInt() }
    val t = Array(l) { IntArray(n) { it } }

    repeat(l) {
        val s = readLine()!!.filterIndexed { i, c ->  i % 2 == 1 }
        for (i in s.indices) {
            if (s[i] == '-') {
                t[it][i] = i + 1
                t[it][i + 1] = i
            }
        }
    }

    val g = readLine()!!.filterIndexed { i, c -> i % 2 == 0 }.indexOf('o')

    var cur = g
    for (i in t.lastIndex downTo 0) {
        cur = t[i][cur]
    }

    println(cur + 1)
}
