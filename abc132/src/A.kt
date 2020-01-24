fun main(args: Array<String>) {
    readLine()!!
            .groupBy { it }
            .all { it.value.count() == 2 }
            .let { println(if (it) "Yes" else "No") }
}
