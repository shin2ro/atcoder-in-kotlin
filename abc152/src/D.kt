fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans = 0
    for (i in 1..9) {
        for (j in 1..9) {
            var x = 0
            var y = 0

            for (k in 1..n) {
                val (a, b) = k.toString().let { it.first() - '0' to it.last() - '0' }
                if (a == i && b == j) x++
                if (b == i && a == j) y++
            }

            ans += x * y
        }
    }
    println(ans)
}
