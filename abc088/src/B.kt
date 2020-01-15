fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }.sortedDescending()
    val alice = a.filterIndexed { index, i -> index and 1 == 0 }.sum()
    val bob = a.filterIndexed { index, i -> index and 1 == 1 }.sum()
    println(alice - bob)
}
