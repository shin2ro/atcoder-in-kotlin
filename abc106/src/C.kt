fun main(args: Array<String>) {
    val s = readLine()!!
    val k = readLine()!!.toLong()

    var cnt = 0
    for (c in s) {
        if (c != '1') break
        cnt++
    }

    println(if (k <= cnt) 1 else s[cnt])
}
