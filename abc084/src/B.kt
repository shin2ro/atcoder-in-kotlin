fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    val s = readLine()!!
    if (!s.slice(0 until a).all { it.isDigit() }) {
        println("No")
        return
    }
    if (s[a] != '-') {
        println("No")
        return
    }
    if (!s.slice(a + 1 until s.length).all { it.isDigit() }) {
        println("No")
        return
    }
    println("Yes")
}
