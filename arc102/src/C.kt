fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val nums = LongArray(k)
    for (i in 1..n) nums[i % k]++
    var ans = 0L
    for (a in 0 until k) {
        val b = (k - a) % k
        val c = (k - a) % k
        if ((b + c) % k != 0) continue
        ans += nums[a] * nums[b] * nums[c]
    }
    println(ans)
}
