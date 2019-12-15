fun main(args: Array<String>) {
    val xs = readLine()!!.map { it.toString().toInt() }
    for (bits in 0 until (1 shl 3)) {
        val sum = (0 until 3).map { if ((bits shr it) and 1 == 0) xs[it + 1] else -xs[it + 1] }.sum()
        if (xs[0] + sum == 7) {
            val s = (0 until 3).joinToString("") {
                if ((bits shr it) and 1 == 0) "+${xs[it + 1]}" else "-${xs[it + 1]}"
            }
            println("${xs[0]}$s=7")
            break
        }
    }
}
