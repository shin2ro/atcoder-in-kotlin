private class ModInt(x: Long) {

    companion object {
        const val MOD = 1e9.toLong() + 7
    }

    val x = (x % MOD + MOD) % MOD

    operator fun plus(other: ModInt): ModInt {
        return ModInt(x + other.x)
    }

    operator fun minus(other: ModInt): ModInt {
        return ModInt(x - other.x)
    }

    operator fun times(other: ModInt): ModInt {
        return ModInt(x * other.x)
    }

    operator fun div(other: ModInt): ModInt {
        return this * other.inv()
    }

    fun pow(exp: Long): ModInt {
        if (exp == 0L) return ModInt(1L)
        var a = pow(exp shr 1)
        a *= a
        if (exp and 1L == 0L) return a
        return this * a
    }

    fun inv(): ModInt {
        return this.pow(MOD - 2)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModInt

        if (x != other.x) return false

        return true
    }

    override fun hashCode(): Int {
        return x.hashCode()
    }

    override fun toString(): String {
        return "$x"
    }

}

fun main(args: Array<String>) {

    fun factorial(n: ModInt): ModInt {
        if (n.x < 0L) return ModInt(0L)
        if (n.x == 0L) return ModInt(1L)
        return n * factorial(n - ModInt(1L))
    }

    val n = readLine()!!.toInt()
    val ts = (0 until n).map { readLine()!!.toLong() }.sorted()

    fun solve1(): Long {
        var penalty = 0L
        var current = 0L

        for (t in ts) {
            penalty += current + t
            current += t
        }

        return penalty
    }

    fun solve2(): ModInt {
        var r = ModInt(1L)
        for ((k, v) in ts.groupBy { it }) {
            val m = ModInt(v.count().toLong())
            r *= factorial(m)
        }
        return r
    }

    println(solve1())
    println(solve2())
}
