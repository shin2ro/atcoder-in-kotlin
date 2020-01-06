fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    val n = x / 100
    var y = x % 100
    repeat(n) {
        for (i in 5 downTo 1) {
            if (y >= i) {
                y -= i
                return@repeat
            }
        }
    }
    println(if (y == 0) 1 else 0)
}
