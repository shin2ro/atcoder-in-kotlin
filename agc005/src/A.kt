import java.util.*

fun main(args: Array<String>) {
    val x = readLine()!!
    var ans = x.length
    val stack = ArrayDeque<Char>()
    for (c in x) {
        if (c == 'S') {
            stack.addFirst(c)
            continue
        }

        if (stack.isNotEmpty()) {
            stack.removeFirst()
            ans -= 2
        }
    }
    println(ans)
}
