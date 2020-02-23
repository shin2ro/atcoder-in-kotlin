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
    val (n, a, b) = readLine()!!.split(' ').map { it.toLong() }
    val comb = Array(200001) { ModInt(1) }
    for (i in 1 until comb.size) {
        comb[i] = ModInt(n - i + 1) / ModInt(i.toLong()) * comb[i - 1]
    }
    println(ModInt(2).pow(n) - comb[a.toInt()] - comb[b.toInt()] - ModInt(1))
}
