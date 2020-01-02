fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val students = (0 until n).map {
        val (x, y) = readLine()!!.split(' ').map { it.toInt() }
        x to y
    }
    val checkpoints = (0 until m).map {
        val (x, y) = readLine()!!.split(' ').map { it.toInt() }
        x to y
    }

    fun manhattan(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Int {
        return Math.abs(p1.first - p2.first) + Math.abs(p1.second - p2.second)
    }

    for (student in students) {
        var no = 1
        var distance = manhattan(student, checkpoints.first())
        for (i in 1 until checkpoints.size) {
            val d = manhattan(student, checkpoints[i])
            if (d < distance) {
                no = i + 1
                distance = d
            }
        }
        println(no)
    }
}
