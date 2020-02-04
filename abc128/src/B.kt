import java.util.Comparator

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    (0 until n)
            .map {
                val (s, p) = readLine()!!.split(' ')
                Triple(it + 1, s, p.toInt())
            }
            .sortedWith(Comparator { o1, o2 ->
                if (o1.second != o2.second)
                    o1.second.compareTo(o2.second)
                else
                    -o1.third.compareTo(o2.third)
            })
            .forEach { println(it.first) }
}
