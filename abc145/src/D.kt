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

private fun fact(n: ModInt): ModInt {
    return (2..n.x).fold(ModInt(1L)) { acc, l -> acc * ModInt(l) }
}

private fun comb(n: ModInt, k: ModInt): ModInt {
    return fact(n) / fact(k) / fact(n - k)
}

fun main(args: Array<String>) {
    val (x, y) = readLine()!!.split(' ').map { it.toInt() }

    if ((x + y) % 3 != 0) {
        println(0)
        return
    }

    val m = (2 * x - y) / 3
    val n = x - 2 * m

    if (m < 0 || n < 0) {
        println(0)
        return
    }

    val mn = ModInt(n.toLong())
    val mm = ModInt(m.toLong())

    println(comb(mn + mm, mn))
}
