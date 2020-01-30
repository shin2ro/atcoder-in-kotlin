fun main(args: Array<String>) {
    val s = readLine()!!
    var ans = true
    for (i in 0 until  s.lastIndex / 2) {
        val j = s.lastIndex - i
        if (s[i] == '*' || s[j] == '*' || s[i] == s[j]) continue
        ans = false
    }
    println(if (ans) "YES" else "NO")
}
