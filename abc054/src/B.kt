fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val a = (0 until n).map { readLine()!! }
    val b = (0 until m).map { readLine()!! }
    var ans = false
    for (i in 0..n - m) {
        for (j in 0..n - m) {
            var flag = true
            for (bi in 0 until m) {
                for (bj in 0 until m) {
                    if (a[i + bi][j + bj] != b[bi][bj]) {
                        flag = false
                    }
                }
            }
            if (flag) ans = true
        }
    }
    println(if (ans) "Yes" else "No")
}
