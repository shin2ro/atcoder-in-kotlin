import java.util.*

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }

    val ops = listOf(-1, 1, -5, 5, -10, 10)
    val visited = mutableSetOf(a)
    val queue = ArrayDeque<Pair<Int, Int>>()
    queue.addLast(a to 0)

    while (queue.isNotEmpty()) {
        val c = queue.removeFirst()

        if (c.first == b) {
            println(c.second)
            break
        }

        for (op in ops) {
            val x = c.first + op
            if (!visited.contains(x)) {
                visited.add(x)
                queue.addLast(x to c.second + 1)
            }
        }
    }

}
