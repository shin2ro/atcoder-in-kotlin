private const val MOD = 1e9.toLong() + 7

private class Comb {

    val n = 2000002

    val fact = LongArray(n + 1)
    val factInv = LongArray(n + 1)

    init {
        fact[0] = 1L
        for (i in 1..n) {
            fact[i] = fact[i - 1] * i % MOD
        }
        factInv[n] = inv(fact[n])
        for (i in n downTo 1) {
            factInv[i - 1] = factInv[i] * i % MOD
        }
    }

    private fun pow(base: Long, exp: Long): Long {
        if (exp == 0L) return 1L
        var a = pow(base, exp shr 1)
        a *= a
        a %= MOD
        if (exp and 1L == 0L) return a
        return base * a % MOD
    }

    private fun inv(x: Long): Long {
        return pow(x, MOD - 2)
    }

    fun comb(n: Int, k: Int): Long {
        if (k !in 0..n) return 0L
        return fact[n] * factInv[k] % MOD * factInv[n - k] % MOD
    }

}

fun main(args: Array<String>) {
    val cb = Comb()

    val (r1, c1, r2, c2) = readLine()!!.split(' ').map { it.toInt() }

    var ans = 0L

    ans += cb.comb(r2 + c2 + 2, r2 + 1) - 1
    ans %= MOD

    ans += MOD
    ans -= cb.comb(r2 + c1 + 1, r2 + 1) - 1
    ans %= MOD

    ans += MOD
    ans -= cb.comb(r1 + c2 + 1, c2 + 1) - 1
    ans %= MOD

    ans += cb.comb(r1 + c1, r1) - 1
    ans %= MOD

    println(ans)
}
