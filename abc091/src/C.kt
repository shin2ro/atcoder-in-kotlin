fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val red = (0 until n).map {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        a to b
    }
    val blue = (0 until n).map {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        a to b
    }.sortedBy { it.first }

    val selected = BooleanArray(n) { false }

    blue.filter { b ->
        red.mapIndexed { index, pair -> index to pair }
                .filter { it ->
                    val i = it.first
                    val r = it.second
                    if (selected[i]) {
                        false
                    } else {
                        r.first < b.first && r.second < b.second
                    }
                }
                .maxBy { it.second.second }
                ?.let {
                    selected[it.first] = true
                    true
                } ?: false
    }.count().let { println(it) }

}
