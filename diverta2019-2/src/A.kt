fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    println(if (k == 1) 0 else n - k)
}
