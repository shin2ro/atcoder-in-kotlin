fun main(args: Array<String>) {
    val (m1, d1) = readLine()!!.split(' ').map { it.toInt() }
    val (m2, d2) = readLine()!!.split(' ').map { it.toInt() }
    println(if (m1 == m2) 0 else 1)
}
