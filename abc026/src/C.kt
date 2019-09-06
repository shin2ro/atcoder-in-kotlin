fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val table = IntArray(n + 1) { 1 }
    val map = mutableMapOf<Int, MutableList<Int>>()
    repeat(n - 1) {
        val b = readLine()!!.toInt()
        map[b] = map[b] ?: mutableListOf()
        map[b]?.add(it + 2)
    }

    for (i in n downTo 1) {
        map[i] ?: continue

        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        map[i]?.forEach {
            max = Math.max(max, table[it])
            min = Math.min(min, table[it])
        }

        table[i] = max + min + 1
    }

    println(table[1])
}
