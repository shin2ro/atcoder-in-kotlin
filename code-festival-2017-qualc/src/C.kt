fun main(args: Array<String>) {
    val s = readLine()!!
    var ans = 0
    var l = 0
    var r = s.lastIndex
    while (l < r) {
        if (s[l] == s[r]) {
            l++
            r--
            continue
        }

        if (s[l] == 'x') {
            l++
            ans++
            continue
        }

        if (s[r] == 'x') {
            r--
            ans++
            continue
        }

        ans = -1
        break
    }
    println(ans)
}
