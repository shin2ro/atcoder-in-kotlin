fun main(args: Array<String>) {
    val n = readLine()!!
    if (n.slice(0..2).all { it == n[0] } || n.slice(1..3).all { it == n[3] }) {
        "Yes"
    } else {
        "No"
    }.let { println(it) }
}
