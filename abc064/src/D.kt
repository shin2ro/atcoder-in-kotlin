fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    var rCounter = 0
    var lCounter = 0

    for (c in s) {
        if (c == '(') {
            rCounter++
            continue
        }

        if (rCounter > 0) {
            rCounter--
            continue
        }

        lCounter++
    }

    println("(".repeat(lCounter) + s + ")".repeat(rCounter))
}
