import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()
    val f = sc.nextInt()

    var max = -0.1
    var ans = 0 to 0

    for (w1 in 0..f step 100 * a) {
        for (w2 in 0..(f - w1) step 100 * b) {
            val water = w1 + w2

            for (s1 in 0..(f - water) step c) {
                for (s2 in 0..(f - water - s1) step d) {
                    val sugar = s1 + s2

                    if (sugar / water.toDouble() > e / 100.0) {
                        continue
                    }

                    val x = sugar / (water + sugar).toDouble()
                    if (x > max) {
                        max = x
                        ans = water + sugar to sugar
                    }
                }
            }
        }
    }

    println("${ans.first} ${ans.second}")
}
