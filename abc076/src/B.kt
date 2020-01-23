fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    println((0 until n).fold(1) { acc, i -> Math.min(acc * 2, acc + k) })
}
