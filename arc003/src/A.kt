fun main(args: Array<String>) {
    val n = readLine()!!.toDouble()
    readLine()!!
            .map {
                when (it) {
                    'A' -> 4
                    'B' -> 3
                    'C' -> 2
                    'D' -> 1
                    else -> 0
                }
            }
            .sum()
            .let { println(it / n) }
}
