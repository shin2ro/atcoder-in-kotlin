fun main(args: Array<String>) {
    val (k, s) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    for (x in 0..k) {
        for (y in 0..k) {
            val z = s - x - y
            if (z in 0..k) ans++
        }
    }
    println(ans)
}
