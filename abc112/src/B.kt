fun main(args: Array<String>) {
    val (n, t) = readLine()!!.split(' ').map { it.toInt() }
    val routes = (0 until n).map {
        val (ci, ti) = readLine()!!.split(' ').map { it.toInt() }
        ci to ti
    }
    routes.filter { it.second <= t }
            .minBy { it.first }
            .let { println(it?.first ?: "TLE") }
}
