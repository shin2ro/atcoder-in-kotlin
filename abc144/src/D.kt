fun main(args: Array<String>) {
    val (a, b, x) = readLine()!!.split(' ').map { it.toDouble() }

    var l = 0.0
    var r = 90.0

    while (l + 1e-9 < r) {
        val m = (r + l) / 2

        val b0 = Math.tan(m * Math.PI / 180) * a

        if (b0 <= b) {
            val x0 = ((a * b0 / 2) + (a * (b - b0))) * a
            if (x0 < x) {
                r = m
            } else {
                l = m
            }
            continue
        }

        val a0 = Math.tan((90 - m) * Math.PI / 180) * b
        val x0 = a0 * b / 2 * a
        if (x0 < x) {
            r = m
        } else {
            l = m
        }
    }

    println(l)
}
