fun main(args: Array<String>) {
    val keywords = listOf("dream", "dreamer", "erase", "eraser").map { it.reversed() }
    val s = readLine()!!
    val sb = StringBuilder(s.reversed())

    while (sb.isNotEmpty()) {
        val matched = keywords.firstOrNull { sb.startsWith(it) } ?: break
        sb.delete(0, matched.length)
    }

    println(if (sb.isEmpty()) "YES" else "NO")
}
