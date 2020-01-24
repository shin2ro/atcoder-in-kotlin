fun main(args: Array<String>) {

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toInt() }

    val m = a.max()!!
    val g = a.reduce { acc, i -> gcd(acc, i) }

    println(if (k <= m && k % g == 0) "POSSIBLE" else "IMPOSSIBLE")
}
