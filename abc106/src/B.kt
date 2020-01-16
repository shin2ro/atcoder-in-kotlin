fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    (1..n step 2)
            .filter { i -> (1..i).count { i % it == 0 } == 8 }
            .count()
            .let { println(it) }
}
