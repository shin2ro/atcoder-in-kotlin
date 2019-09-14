fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val b = readLine()!!.split(' ').map { it.toInt() }

    var ans = b[0]

    for (i in b.indices) {
        ans += when (i) {
            b.lastIndex -> b.last()
            else -> listOf(b[i], b[i + 1]).min()!!
        }
    }

    println(ans)
}
