fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    println(s.map { ('A' + (it - 'A' + n) % 26).toChar() }.joinToString(""))
}
