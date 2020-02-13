fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val s = readLine()!!.toCharArray()
    s[k - 1] = s[k - 1] - ('A' - 'a')
    println(s)
}
