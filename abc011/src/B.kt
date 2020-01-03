fun main(args: Array<String>) {
    val s = readLine()!!
    println(s.mapIndexed { index, c -> if (index == 0) c.toUpperCase() else c.toLowerCase() }.joinToString(""))
}
