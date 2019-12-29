fun main(args: Array<String>) {
    val (sx, sy, tx, ty) = readLine()!!.split(' ').map { it.toInt() }
    print("U".repeat(ty - sy))
    print("R".repeat(tx - sx))
    print("D".repeat(ty - sy))
    print("L".repeat(tx - sx))
    print("L")
    print("U".repeat(ty - sy + 1))
    print("R".repeat(tx - sx + 1))
    print("D")
    print("R")
    print("D".repeat(ty - sy + 1))
    print("L".repeat(tx - sx + 1))
    print("U")
    println()
}
