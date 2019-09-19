fun main(args: Array<String>) {

    fun gcd(a: Long, b: Long): Long {
        return if (b == 0L) a else gcd(b, a % b)
    }

    fun lcm(a: Long, b: Long): Long {
        return a / gcd(a, b) * b
    }

    val n = readLine()!!.toInt()
    val xs = (0 until n).map { readLine()!!.toLong() }

    println(xs.reduce { acc, l -> lcm(acc, l) })
}
