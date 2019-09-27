fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    val words = mutableSetOf<String>()

    val blue = mutableMapOf<String, Int>()
    repeat(n) {
        val s = readLine()!!
        words.add(s)
        blue[s] = blue.getOrPut(s) { 0 } + 1
    }

    val m = readLine()!!.toInt()
    val red = mutableMapOf<String, Int>()
    repeat(m) {
        val s = readLine()!!
        words.add(s)
        red[s] = red.getOrPut(s) { 0 } + 1
    }

    words.map {
        blue.getOrElse(it) { 0 } - red.getOrElse(it) { 0 }
    }.max()!!.let { println(if (it >= 0) it else 0) }

}
