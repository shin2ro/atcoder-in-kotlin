fun main(args: Array<String>) {
    readLine()
    val xs = readLine()!!.split(' ').map { it.toInt() }

    val set = mutableSetOf<Int>()

    var min = xs.first()
    var profit = 0

    for (x in xs.slice(1..xs.lastIndex)) {
        val p = x - min
        min = Math.min(min, x)

        if (p > profit) {
            set.clear()
            set.add(x)
            profit = p
        }

        if (p == profit) {
            set.add(x)
        }

    }

    println(set.size)
}
