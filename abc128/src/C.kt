fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val ss = (0 until m).map { readLine()!!.split(' ').map { it.toInt() }.drop(1) }
    val ps = readLine()!!.split(' ').map { it.toInt() }

    var ans = 0

    for (i in 0 until (1 shl n)) {
        ss.indices
                .all { j -> ss[j].count { i shr (it - 1) and 1 == 1 } % 2 == ps[j] }
                .let { if (it) ans++ }
    }

    println(ans)
}
