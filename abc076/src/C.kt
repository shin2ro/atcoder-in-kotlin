fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!

    (0..s.length - t.length)
            .filter { i -> (t.indices).all { j -> s[i + j] == t[j] || s[i + j] == '?' } }
            .map { s.slice(0 until it) + t + s.slice(it + t.length until s.length) }
            .map { it.replace('?', 'a') }
            .min()
            .let { println(it ?: "UNRESTORABLE") }
}
