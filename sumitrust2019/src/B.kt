fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (x in 1..50000) {
        val y = (x * 1.08).toInt()
        if (y == n) {
            println(x)
            return
        }
    }
    println(":(")
}
