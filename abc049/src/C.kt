fun main(args: Array<String>) {
    val keywords = arrayOf("dream", "dreamer", "erase", "eraser").map { it.reversed() }.toTypedArray()
    val s = StringBuilder(readLine()!!.reversed())
    while (s.isNotEmpty()) {
        val m = keywords.firstOrNull { s.startsWith(it) } ?: break
        s.delete(0, m.length)
    }
    println(if (s.isEmpty()) "YES" else "NO")
}
