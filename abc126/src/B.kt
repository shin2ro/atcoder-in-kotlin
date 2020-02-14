fun main(args: Array<String>) {
    val s = readLine()!!
    val x1 = s.take(2).toInt()
    val x2 = s.takeLast(2).toInt()

    val ans = when {
        x1 in 1..12 && x2 in 1..12 -> "AMBIGUOUS"
        x1 !in 1..12 && x2 in 1..12 -> "YYMM"
        x1 in 1..12 && x2 !in 1..12 -> "MMYY"
        else -> "NA"
    }

    println(ans)
}
