fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(' ')
            .map { it.toInt() }
            .sortedDescending()
    println(a * 10 + b + c)
}
