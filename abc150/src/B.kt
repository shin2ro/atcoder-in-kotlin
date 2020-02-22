fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    (0 until n - 2)
            .filter {
                "${s[it]}${s[it + 1]}${s[it + 2]}" == "ABC"
            }
            .count()
            .let { println(it) }
}
