fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val cities = (0 until n).map {
        val (s, p) = readLine()!!.split(' ')
        s to p.toInt()
    }
    val sum = cities.sumBy { it.second }
    val max = cities.maxBy { it.second }!!

    println(if (max.second > sum / 2) max.first else "atcoder")
}
