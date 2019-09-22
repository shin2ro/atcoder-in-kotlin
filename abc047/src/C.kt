fun main(args: Array<String>) {
    val s = readLine()!!
    var ans = 0
    for (i in 1 until s.length) {
        if (s[i - 1] != s[i]) {
            ans += 1
        }
    }
    println(ans)
}
