fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = (0 until n).map { readLine()!! }

    var ans = 0
    var c1 = 0 // B..A
    var c2 = 0 // ..A
    var c3 = 0 // B..

    for (i in s.indices) {

        for (j in 1 until s[i].length) {
            if (s[i][j - 1] == 'A' && s[i][j] == 'B') ans++
        }

        when {
            s[i].first() == 'B' && s[i].last() == 'A' -> c1++
            s[i].last() == 'A' -> c2++
            s[i].first() == 'B' -> c3++
        }
    }

    when {
        c1 == 0 -> ans += Math.min(c2, c3)
        c2 + c3 > 0 -> ans += c1 + Math.min(c2, c3)
        c2 + c3 == 0 -> ans += c1 - 1
    }

    println(ans)
}
