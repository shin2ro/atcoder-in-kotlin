fun main(args: Array<String>) {
    val (w, h) = readLine()!!.split(' ').map { it.toInt() }
    println(if (w / 4 * 3 == h) "4:3" else "16:9")
}
