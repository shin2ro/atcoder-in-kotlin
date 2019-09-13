fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val ps = (0 until n).map {
        val (x, y, h) = readLine()!!.split(' ').map { it.toInt() }
        Triple(x, y, h)
    }

    val p = ps.first { it.third > 0 }

    for (cx in 0..100) {
        for (cy in 0..100) {
            val ch = p.third + Math.abs(p.first - cx) + Math.abs(p.second - cy)
            if (ps.all { it.third == Math.max(ch - Math.abs(it.first - cx) - Math.abs(it.second - cy), 0) }) {
                println("$cx $cy $ch")
                return
            }
        }
    }

}
