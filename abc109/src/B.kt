fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans = true
    var word = readLine()!!
    val set = mutableSetOf(word)

    repeat(n - 1) {
        val w = readLine()!!
        if (set.contains(w)) {
            ans = false
        }
        if (word.last() != w.first()) {
            ans = false
        }
        word = w
        set.add(word)
    }

    println(if (ans) "Yes" else "No")
}
