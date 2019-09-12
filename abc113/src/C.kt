fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }

    val cities = (0 until m).map { i ->
        val (p, y) = readLine()!!.split(' ').map { it.toInt() }
        Triple(i, p, y)
    }

    val prefectures = IntArray(n + 1) { 0 }
    val ids = Array(m) { "" }

    cities.sortedBy { it.third }.forEach {
        prefectures[it.second]++
        val id1 = it.second.toString().padStart(6, '0')
        val id2 = prefectures[it.second].toString().padStart(6, '0')
        ids[it.first] = id1 + id2
    }

    ids.forEach { println(it) }
}
