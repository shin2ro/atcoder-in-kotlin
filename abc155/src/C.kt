fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    var mx = 0
    val mp = mutableMapOf<String, Int>()

    repeat(n) {
        val s = readLine()!!
        mp[s] = (mp[s] ?: 0) + 1
        mx = Math.max(mx, mp[s]!!)
    }

    mp.entries
            .filter { it.value == mx }
            .map { it.key }
            .sorted()
            .joinToString("\n")
            .let { println(it) }
}
