fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val (s, t) = readLine()!!.split(' ')
    for (i in 0 until n) {
        print("${s[i]}${t[i]}")
    }
    println()
}
