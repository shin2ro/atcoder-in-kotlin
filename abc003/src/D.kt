fun main(args: Array<String>) {
    val (r, c) = readLine()!!.split(' ').map { it.toLong() }
    val (x, y) = readLine()!!.split(' ').map { it.toLong() }
    val (d, l) = readLine()!!.split(' ').map { it.toLong() }

    val ans1 = (r - x + 1) * (c - y + 1)
    var ans2 = conb(x * y, d) * conb(x * y - d, l) % MOD
    var ans3 = 0L

    run {
        val x1 = conb((x - 1) * y, d) * conb((x - 1) * y - d, l) % MOD
        val x2 = conb(x * (y - 1), d) * conb(x * (y - 1) - d, l) % MOD
        (x1 * 2 % MOD + x2 * 2 % MOD) % MOD
    }.let {
        ans3 = (ans3 + it) % MOD
    }

    run {
        val x1 = conb((x - 1) * (y - 1), d) * conb((x - 1) * (y - 1) - d, l) % MOD
        val x2 = conb((x - 2) * y, d) * conb((x - 2) * y - d, l) % MOD
        val x3 = conb(x * (y - 2), d) * conb(x * (y - 2) - d, l) % MOD
        (x1 * 4 % MOD + x2 + x3) % MOD
    }.let {
        ans3 = (ans3 + MOD - it) % MOD
    }

    run {
        val x1 = conb((x - 2) * (y - 1), d) * conb((x - 2) * (y - 1) - d, l) % MOD
        val x2 = conb((x - 1) * (y - 2), d) * conb((x - 1) * (y - 2) - d, l) % MOD
        (x1 * 2 % MOD + x2 * 2 % MOD) % MOD
    }.let {
        ans3 = (ans3 + it) % MOD
    }

    run {
        if (x > 1 && y > 1) {
            conb((x - 2) * (y - 2), d) * conb((x - 2) * (y - 2) - d, l) % MOD
        } else {
            0
        }
    }.let {
        ans3 = (ans3 + MOD - it) % MOD
    }

    ans2 = ((ans2 + MOD) - ans3) % MOD

    println(ans1 * ans2 % MOD)
}

private const val MOD = 1000000007L

private fun fact(n: Long): Long {
    if (n < 0L) return 0L
    if (n == 0L) return 1L
    return n * fact(n - 1) % MOD
}

private fun conb(n: Long, k: Long): Long {
    return div(div(fact(n), fact(n - k)), fact(k))
}

private fun div(a: Long, b: Long) :Long {

    fun calc(a: Long, b: Long): Long {
        if (b == 0L) return 1L
        if (b % 2L == 0L) {
            val d = calc(a, b / 2)
            return d * d % MOD
        }
        return a * calc(a, b - 1) % MOD
    }

    return a * calc(b, MOD - 2)  % MOD
}
