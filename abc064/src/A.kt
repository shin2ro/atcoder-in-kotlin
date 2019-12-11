fun main(args: Array<String>) {
    readLine()!!.split(' ')
            .joinToString("")
            .toInt()
            .let { println(if (it % 4 == 0) "YES" else "NO") }
}
