fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val ac = IntArray(n + 1)
    val wa = IntArray(n + 1)
    repeat(m) {
        val (pi, s) = readLine()!!.split(' ')
        val p = pi.toInt()
        if (s == "AC") {
            ac[p] = 1
            return@repeat
        }
        if (ac[p] == 0) {
            wa[p] += 1
        }
    }

    var a = 0
    var w = 0
    for (i in 1..n) {
        if (ac[i] > 0) {
            a++
            w += wa[i]
        }
    }
    println("$a $w")
}
