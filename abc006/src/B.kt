fun main(args: Array<String>) {
    val mod = 10007
    val n = readLine()!!.toInt()
    val a = IntArray(1e6.toInt() + 1)
    a[1] = 0
    a[2] = 0
    a[3] = 1
    for (i in 4..n) {
        a[i] = a[i - 1] + a[i - 2] + a[i - 3]
        a[i] %= mod
    }
    println(a[n])
}
