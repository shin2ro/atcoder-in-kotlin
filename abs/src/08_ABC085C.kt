fun main(args: Array<String>) {
    val (n, y) = readLine()!!.split(' ').map { it.toInt() }

    var ans = Triple(-1, -1, -1)
    for (i in 0..n) {
        for (j in 0..(n - i)) {
            val k = n - i - j
            if (10000 * i + 5000 * j + 1000 * k == y) {
                ans = Triple(i, j, k)
            }
        }
    }

    println("${ans.first} ${ans.second} ${ans.third}")
}
