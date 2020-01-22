fun main(args: Array<String>) {
    val s = readLine()!!.toLong()

    val x1 = 1e9.toLong()
    val y1 = 1

    val y2 = (s + x1 - 1) / x1
    val x2 = x1 * y2 - s

    println("0 0 $x1 $y1 $x2 $y2")
}
