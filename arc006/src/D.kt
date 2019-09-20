fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val figure = (0 until h).map {
        readLine()!!.map { it == 'o' }.toBooleanArray()
    }

    val table = Array(h) { IntArray(w) { 0 } }

    table[0][0] = if (figure[0][0]) 1 else 0

    for (i in 1 until w) {
        table[0][i] = table[0][i - 1] + if (figure[0][i]) 1 else 0
    }

    for (i in 1 until h) {
        table[i][0] = table[i - 1][0] + if (figure[i][0]) 1 else 0
    }

    for (i in (1 until h)) {
        for (j in 1 until w) {
            table[i][j] = table[i - 1][j] + table[i][j - 1] - table[i - 1][j - 1]
            table[i][j] += if (figure[i][j]) 1 else 0
        }
    }

    var a = 0
    var b = 0
    var c = 0

    fun area(x: Int, y: Int, w: Int, h: Int): Int {
        val xx = x + w - 1
        val yy = y + h - 1

        return table[yy][xx] -
                (if (y == 0) 0 else table[y - 1][xx]) -
                (if (x == 0) 0 else table[yy][x - 1]) +
                (if (x == 0 || y == 0) 0 else table[y - 1][x - 1])
    }

    var scale = 1

    while (7 * scale <= h && 7 * scale <= w) {

        var j = 0

        while (j < (h - (7 * scale) + 1)) {

            var i = 0

            while (i < (w - (7 * scale) + 1)) {
                val curH = j

                val area1 = area(i, curH, 7 * scale, 7 * scale)
                val area2 = area(i + (1 * scale), curH + (1 * scale), 7 * scale - 2 * scale, 7 * scale - 2 * scale)

                if (area1 != area2) {
                    i++
                    continue
                }

                val r = scale * scale

                if (area2 == 12 * r) {
                    a++
                } else if (area2 == 16 * r) {
                    b++
                } else if (area2 == 11 * r) {
                    c++
                } else {
                    i++
                    continue
                }

                i += 7 * scale
            }

            j++
        }

        scale++
    }

    println("$a $b $c")
}
