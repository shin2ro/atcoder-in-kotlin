fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    readLine()!!.split(' ')
            .mapIndexed { index, s ->
                index + 1 to s.toInt()
            }
            .sortedBy { it.second }
            .map { it.first }
            .joinToString(" ")
            .let { println(it) }

}
