fun main(args: Array<String>) {
    readLine()
    readLine()!!
            .split(' ')
            .map { it.toDouble() }
            .sorted()
            .reduce { acc, d -> (acc + d) / 2 }
            .let { println(it) }
}
