import java.util.*

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val graph = mutableMapOf<Int, MutableList<Int>>()

    repeat(m) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }
        graph.getOrPut(a) { mutableListOf() }.add(b)
        graph.getOrPut(b) { mutableListOf() }.add(a)
    }

    repeat(n) { i ->
        val user = i + 1

        val friends = mutableSetOf(user)
        val queue = ArrayDeque<Int>()

        for (friend in graph[user] ?: emptyList<Int>()) {
            if (friends.contains(friend)) {
                continue
            }
            friends.add(friend)
            queue.addLast(friend)
        }

        val ans = mutableSetOf<Int>()

        while (queue.isNotEmpty()) {
            val friend = queue.removeFirst()
            ans.addAll(graph[friend]?.filter { !friends.contains(it) } ?: emptyList())
        }

        println(ans.size)
    }

}
