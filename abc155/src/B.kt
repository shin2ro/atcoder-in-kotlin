fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }
    val ans = a.all {
        if (it % 2 == 0) {
            it % 3 == 0 || it % 5 == 0
        } else {
            true
        }
    }
    println(if (ans) "APPROVED" else "DENIED")
}
