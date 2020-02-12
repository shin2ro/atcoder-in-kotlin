fun main(args: Array<String>) {
    val (R, G, B, N) = readLine()!!.split(' ').map { it.toInt() }
    var ans = 0
    for (r in 0..N) {
        for (g in 0..N - r) {
            val n = N - (r * R + g * G)
            if (n >= 0 && n % B == 0) {
                ans++
            }
        }
    }
    println(ans)
}
