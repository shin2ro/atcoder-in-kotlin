fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(listOf(a.toString().repeat(b), b.toString().repeat(a)).min())
}
