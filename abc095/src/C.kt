fun main(args: Array<String>) {
    val (a, b, c, x, y) = readLine()!!.split(' ').map { it.toInt() }

    val mutableList = mutableListOf<Int>()

    mutableList.add(a * x + b * y)
    mutableList.add(c * x * 2 + if (x >= y) 0 else b * (y - x))
    mutableList.add(c * y * 2 + if (y >= x) 0 else a * (x - y))

    println(mutableList.min())
}
