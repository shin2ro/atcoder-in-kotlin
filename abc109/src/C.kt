fun main(args: Array<String>) {

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    val (n, x) = readLine()!!.split(' ').map { it.toInt() }
    val xs = readLine()!!.split(' ').map { it.toInt() }
    xs.map { Math.abs(x - it) }
            .reduce { acc, i -> gcd(acc, i) }
            .let { println(it) }

}
