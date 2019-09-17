fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!

    val atcoder = "atcoder"

    s.indices.all {
        if (s[it] == t[it]) true
        else if (s[it] == '@' && t[it] in atcoder) true
        else s[it] in atcoder && t[it] == '@'
    }.let {
        println(if (it) "You can win" else "You will lose")
    }
}
