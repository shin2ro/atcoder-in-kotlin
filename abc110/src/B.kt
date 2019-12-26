fun main(args: Array<String>) {
    val (n, m, x, y) = readLine()!!.split(' ').map { it.toInt() }
    val xs = readLine()!!.split(' ').map { it.toInt() }.plus(x)
    val ys = readLine()!!.split(' ').map { it.toInt() }.plus(y)
    println(if (xs.max()!! < ys.min()!!) "No War" else "War")
}
