fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    var min = a.first()
    for (i in 0 until n) {
        min = Math.min(a[i], min)
        if (a[i] <= min) {
            ans++
        }
    }
    println(ans)
}
