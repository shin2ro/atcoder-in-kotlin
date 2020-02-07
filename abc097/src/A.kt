fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(' ').map { it.toInt() }
    val ans = when {
        Math.abs(a - c) <= d -> "Yes"
        Math.abs(a - b) <= d && Math.abs(b - c) <= d -> "Yes"
        else -> "No"
    }
    println(ans)
}
