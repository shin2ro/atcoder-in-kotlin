fun main(args: Array<String>) {
    val s = readLine()!!
    (0..s.length - 3)
            .map { s.slice(it..it + 2).toInt() }
            .map { Math.abs(753 - it) }
            .min()
            .let { println(it) }
}
