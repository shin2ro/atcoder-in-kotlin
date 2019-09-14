fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() - 1 }
    val b = readLine()!!.split(' ').map { it.toInt() }
    val c = readLine()!!.split(' ').map { it.toInt() }

    var ans = b[a[0]]

    for (i in 1 until n) {
        ans += if (a[i - 1] + 1 == a[i]) {
            b[a[i]] + c[a[i - 1]]
        } else {
            b[a[i]]
        }
    }

    println(ans)
}
