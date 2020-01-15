fun main(args: Array<String>) {
    val c = (0 until 3).map {
        readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    }.toTypedArray()

    val a = IntArray(3)
    val b = c.first()
    a[1] = c[1][0] - b[0]
    a[2] = c[2][0] - b[0]

    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (c[i][j] != a[i] + b[j]) {
                println("No")
                return
            }
        }
    }

    println("Yes")
}
