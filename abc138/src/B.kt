fun main(args: Array<String>) {
    readLine()
    readLine()!!
            .split(' ')
            .map { 1 / it.toDouble() }
            .sum()
            .let { println(1 / it) }
}
