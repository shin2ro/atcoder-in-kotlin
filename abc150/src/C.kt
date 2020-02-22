fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(' ').joinToString("").toInt()
    val q = readLine()!!.split(' ').joinToString("").toInt()

    val list = mutableListOf<Int>()

    fun f(x: Int, used: Set<Int>) {
        if (used.size == n) {
            list.add(x)
            return
        }

        for (i in 1..n) {
            if (!used.contains(i)) {
                f(x * 10 + i, used.plus(i))
            }
        }
    }

    f(0, emptySet())

    var a = 0
    var b = 0

    for (i in list.indices) {
        if (list[i] == p) {
            a = i
        }
        if (list[i] == q) {
            b = i
        }
    }

    println(Math.abs(a - b))
}
