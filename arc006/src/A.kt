fun main(args: Array<String>) {
    val e = readLine()!!.split(' ').map { it.toInt() }.toSet()
    val b = readLine()!!.toInt()
    val l = readLine()!!.split(' ').map { it.toInt() }.toSet()

    l.count {
        e.contains(it)
    }.let {
        val ans = when (it) {
            6 -> 1
            5 -> if (l.contains(b)) 2 else 3
            4 -> 4
            3 -> 5
            else -> 0
        }
        println(ans)
    }
}
