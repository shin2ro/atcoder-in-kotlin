import java.io.PrintWriter

fun main(args: Array<String>) {

    // Sieve of Eratosthenes
    fun sieve(n: Int): Set<Int> {
        val primeNumbers = mutableSetOf<Int>()
        val sieved = mutableSetOf<Int>()

        for (i in 2..n) {
            if (sieved.contains(i)) continue
            primeNumbers.add(i)
            if (i * i <= n) {
                var j = 2
                while (i * j <= n) {
                    sieved.add(i * j)
                    j++
                }
            }
        }
        return primeNumbers
    }

    val primeNums = sieve(100000)
    val ans = IntArray(100001)
    for (i in 1..100000) {
        if (primeNums.contains(i) && primeNums.contains((i + 1) / 2)) {
            ans[i] = ans[i - 1] + 1
        } else {
            ans[i] = ans[i - 1]
        }
    }

    // main
    val pw = PrintWriter(System.out)

    val q = readLine()!!.toInt()
    repeat(q) {
        val (l, r) = readLine()!!.split(' ').map { it.toInt() }
        pw.println(ans[r] - ans[l - 1])
    }

    pw.flush()
}
