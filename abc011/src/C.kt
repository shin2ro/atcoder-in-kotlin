fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val ng = (0 until 3).map { readLine()!!.toInt() }

    if (ng.contains(n)) {
        println("NO")
        return
    }

    var x = n

    repeat(100) {
        for (i in 3 downTo 1) {
            if (!ng.contains(x - i) && x - i >= 0) {
                x -= i
                return@repeat
            }
        }
    }

    println(if (x == 0) "YES" else "NO")
}
