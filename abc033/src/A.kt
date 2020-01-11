fun main(args: Array<String>) {
    val n = readLine()!!
    println(if (n.toSet().size == 1) "SAME" else "DIFFERENT")
}
