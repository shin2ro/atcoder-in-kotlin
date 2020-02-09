fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    val ans = if (s.slice(0 until n / 2) == s.slice(n / 2 until n)) {
        "Yes"
    } else {
        "No"
    }
    println(ans)
}
