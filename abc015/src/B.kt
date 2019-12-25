fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val xs = readLine()!!.split(' ').map { it.toInt() }
    println(Math.ceil(xs.filter { it > 0 }.average()).toInt())
}
