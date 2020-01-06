fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var ans = 0
    for (i in 0 until 1000) {
        val pin = i.toString().padStart(3, '0')
        var j = 0
        for (c in s) {
            if (j < 3 && c == pin[j]) {
                j++
            }
        }
        if (j == 3) {
            ans++
        }
    }
    println(ans)
}
