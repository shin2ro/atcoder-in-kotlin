fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = IntArray(n) { readLine()!!.toInt() }.toSet()
    println(xs.size)
}
