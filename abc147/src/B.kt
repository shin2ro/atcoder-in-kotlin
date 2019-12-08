fun main(args: Array<String>) {
    val s = readLine()!!

    (0 until s.length / 2)
            .filter { s[it] != s[s.lastIndex - it] }
            .count()
            .let { println(it) }
}
