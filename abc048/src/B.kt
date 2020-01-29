fun main(args: Array<String>) {
    val (a, b, x) = readLine()!!.split(' ').map { it.toLong() }
    fun f(n: Long): Long {
        return if (n >= 0) n / x + 1 else 0
    }
    println(f(b) - f(a - 1))
}
