fun main(args: Array<String>) {
    val s = readLine()!!
    val k = readLine()!!.toInt()
    val a = mutableSetOf<String>()
    for (i in s.indices) {
        val b = (i until Math.min(i + k, s.length)).map { s.slice(i..it) }.toSet()
        a += b
    }
    println(a.sorted()[k - 1])
}
