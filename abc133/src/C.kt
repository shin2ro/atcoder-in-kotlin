fun main(args: Array<String>) {
    val (l, r) = readLine()!!.split(' ').map { it.toInt() }
    val xs = (l .. Math.min(r, l + 2018)).map { it % 2019 }
    var ans = 2019
    for (i in 0 until xs.size - 1) {
        for (j in i + 1 until xs.size) {
            ans = Math.min(ans, xs[i] * xs[j] % 2019)
        }
    }
    println(ans)
}
