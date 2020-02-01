fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    val m = readLine()!!.toInt()
    val b = readLine()!!.split(' ').map { it.toInt() }

    var ans = true
    var j = 0
    for (i in 0 until n) {
        if (j > b.lastIndex) break
        if (b[j] in (a[i]..a[i] + t)) {
            j++
            continue
        }
    }

    if (j < b.size) ans = false

    println(if (ans) "yes" else "no")
}
