fun main(args: Array<String>) {
    readLine()!!.split(' ')
            .map { it.first() }
            .joinToString("")
            .let { println(it) }
}
