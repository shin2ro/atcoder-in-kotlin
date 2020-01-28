fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!.toInt()

    val map = mutableMapOf(
            'L' to 0,
            'R' to 0,
            'U' to 0,
            'D' to 0,
            '?' to 0
    )
    for (c in s) {
        map[c] = map[c]!! + 1
    }

    val d = Math.abs(map['L']!! - map['R']!!) + Math.abs(map['U']!! - map['D']!!)
    if (t == 1) {
        println(d + map['?']!!)
    } else {
        val x = d - map['?']!!
        when {
            x >= 0 -> println(x)
            x % 2 == 0 -> println(0)
            else -> println(1)
        }
    }
}
