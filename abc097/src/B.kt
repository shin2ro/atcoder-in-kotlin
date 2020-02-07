fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    var ans = 1
    for (i in 2..x) {
        var j = i * i
        while (j <= x) {
            ans = Math.max(ans, j)
            j *= i
        }
    }
    println(ans)
}
