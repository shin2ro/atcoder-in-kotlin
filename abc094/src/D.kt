fun main(args: Array<String>) {
    readLine()
    val xs = readLine()!!.split(' ').map { it.toInt() }.sortedDescending()

    val n = xs[0]
    var r = xs[1]
    var d = Math.abs(n / 2.0 - r)

    for (i in 2 until xs.size) {
        Math.abs(n / 2.0 - xs[i]).let {
            if (it < d) {
                r = xs[i]
                d = it
            }
        }
    }

    println("$n $r")
}
