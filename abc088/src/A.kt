fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.toInt()
    println(if (n % 500 <= a) "Yes" else "No")
}
