import java.util.Comparator

fun main(args: Array<String>) {
    val (n, d, a) = readLine()!!.split(' ').map { it.toLong() }
    val ms = (0 until n).map {
        val (x, h) = readLine()!!.split(' ').map { it.toLong() }
        x to h
    }.sortedBy { it.first }

    var ans = 0L
    val hs = LongArray(n.toInt() + 2)

    for (i in 0 until n.toInt()) {
        val j = ms.binarySearch(
                ms[i].first + 2 * d to 0,
                Comparator { o1, o2 -> if (o1.first > o2.first) 1 else -1 }
        ).let { -(it + 1) }

        hs[i + 1] += hs[i]
        val h = Math.max(ms[i].second + hs[i + 1], 0)
        val c = (h + a - 1) / a

        ans += c
        hs[i + 1] -= a * c
        hs[j + 1] += a * c
    }

    println(ans)
}
