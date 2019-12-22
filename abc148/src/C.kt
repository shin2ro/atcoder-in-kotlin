fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toLong() }

    fun gcd(a: Long, b: Long): Long {
        return if (b == 0L) a else gcd(b, a % b)
    }

    fun lcm(a: Long, b: Long): Long {
        return a / gcd(a, b) * b
    }

    println(lcm(a, b))
}
