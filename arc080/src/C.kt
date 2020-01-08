fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toInt() }

    val n4 = a.filter { it % 4 == 0 }.count()
    val n2 = (a.filter { it % 2 == 0 }.count() - n4) / 2

    println(if (n4 + n2 >= n / 2) "Yes" else "No")
}
