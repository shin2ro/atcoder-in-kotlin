fun main(args: Array<String>) {
    readLine()
    val cards = readLine()!!.split(' ').map { it.toInt() }.sortedDescending()
    val ans = cards.foldIndexed(0) { index, acc, i -> acc + if (index % 2 == 0) i else -i }
    println(ans)
}
