fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    var a = 0
    var b = 0
    var c = n

    repeat(4 * n - m) {
        when {
            b > 0 -> {
                a++
                b--
            }
            c > 0 -> {
                b++
                c--
            }
        }
    }

    println(if (2 * a + 3 * b + 4 * c == m) "$a $b $c" else "-1 -1 -1")
}
