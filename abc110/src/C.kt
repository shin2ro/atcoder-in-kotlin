fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!

    val map1 = mutableMapOf<Char, Char>()
    val map2 = mutableMapOf<Char, Char>()

    var ans = true

    for (i in s.indices) {
        if (map1.containsKey(s[i]) && map1[s[i]] != t[i]) ans = false
        if (!map1.containsKey(s[i])) map1[s[i]] = t[i]
        if (map2.containsKey(t[i]) && map2[t[i]] != s[i]) ans = false
        if (!map2.containsKey(t[i])) map2[t[i]] = s[i]
    }

    println(if (ans) "Yes" else "No")
}
