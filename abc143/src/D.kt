import java.util.*

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }.sorted()

    var ans = 0

    for (i in 0 until n - 2) {
        val a = xs[i]
        for (j in i + 1 until n - 1) {
            val b = xs[j]

            ans += xs.binarySearch(a + b, Comparator { o1, o2 -> if (o1 >= o2) 1 else -1 }, j + 1)
                    .let { -(it + 1) - 1 }
                    .let { it - j }
        }
    }

    println(ans)
}
