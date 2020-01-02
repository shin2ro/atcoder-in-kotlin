fun main(args: Array<String>) {
    val (n, m, x) = readLine()!!.split(' ').map { it.toInt() }
    val a = readLine()!!.split(' ').map { it.toInt() }
    println(Math.min(a.filter { it < x }.count(), a.filter { it > x }.count()))
}
