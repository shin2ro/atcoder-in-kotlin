fun main(args: Array<String>) {
    val weekdays = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT").reversed()
    val s = readLine()!!
    println(weekdays.indexOf(s) + 1)
}
