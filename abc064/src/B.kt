fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }
    println(xs.max()!! - xs.min()!!)
}
