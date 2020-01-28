fun main(args: Array<String>) {
    val (n, q) = readLine()!!.split(' ').map { it.toInt() }
    val ops = (0 until q).map {
        val (l, r) = readLine()!!.split(' ').map { it.toInt() }
        l to r
    }
    val cs = IntArray(n + 2)
    for ((l, r) in ops) {
        cs[l] += 1
        cs[r + 1] -= 1
    }
    for (i in 1..n) {
        cs[i] = cs[i - 1] + cs[i]
    }
    println(cs.slice(1..n).map { it % 2 }.joinToString(""))
}
