fun main(args: Array<String>) {
    val xs = readLine()!!.split(' ').map { it.toInt() }
    val max = xs.max()!!
    println(if (xs.sum() - max == max) "Yes" else "No")
}
