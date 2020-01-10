fun main(args: Array<String>) {
    val s = readLine()!!
    val ans = s.split('+').filter { !it.contains('0') }.count()
    println(ans)
}
