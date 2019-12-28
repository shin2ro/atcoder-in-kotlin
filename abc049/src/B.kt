fun main(args: Array<String>) {
    val (h, w) = readLine()!!.split(' ').map { it.toInt() }
    val grid = (0 until h).map { readLine()!! }
    for (line in grid) {
        println(line)
        println(line)
    }
}
