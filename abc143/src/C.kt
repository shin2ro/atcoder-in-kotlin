fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var ans = 0
    var c = ' '
    for (i in 0 until n) {
        if (c != s[i]) {
            ans++
        }
        c = s[i]
    }
    println(ans)
}
