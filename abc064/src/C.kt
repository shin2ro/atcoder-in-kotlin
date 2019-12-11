fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }

    val ans = IntArray(9)
    for (x in xs) {
        val i = x / 400
        if (i >= 8) {
            ans[8]++
        } else {
            ans[i] = 1
        }
    }

    println("${ans.take(ans.size - 1).sum().let { if (it == 0) 1 else it }} ${ans.sum()}")
}
