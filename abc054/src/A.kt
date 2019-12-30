fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { (it.toInt() + 11) % 13 }
    if (a < b) println("Bob")
    if (a == b) println("Draw")
    if (a > b) println("Alice")
}
