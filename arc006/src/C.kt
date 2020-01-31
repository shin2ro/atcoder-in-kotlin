import java.util.Comparator

fun main(args: Array<String>) {

    fun MutableList<Int>.lowerBound(x: Int): Int {
        return this
                .binarySearch(x, Comparator { o1, o2 -> if (o1 >= o2) 1 else -1 })
                .let { -(it + 1) }
    }

    val n = readLine()!!.toInt()
    val ms = mutableListOf<Int>()

    repeat(n) {
        val w = readLine()!!.toInt()
        val l = ms.lowerBound(w)

        if (l == ms.size) {
            ms.add(w)
        } else {
            ms[l] = w
        }
    }

    println(ms.size)
}
