fun main(args: Array<String>) {
    val c = readLine()!!.first()
    if (c in listOf('a', 'e', 'i', 'o', 'u')) {
        "vowel"
    } else {
        "consonant"
    }.let { println(it) }
}
