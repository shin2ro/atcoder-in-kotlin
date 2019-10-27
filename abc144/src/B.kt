fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans = "No"
    for (a in 1..9) {
        for (b in 1..9) {
            if (a * b == n) {
                ans = "Yes"
            }
        }
    }
    println(ans)
}
