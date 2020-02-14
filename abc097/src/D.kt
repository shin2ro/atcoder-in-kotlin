private class UnionFind(n: Int) {

    private val par = IntArray(n) { -1 }

    fun find(x: Int): Int {
        if (par[x] < 0) {
            return x
        }
        par[x] = find(par[x])
        return par[x]
    }

    fun unite(x: Int, y: Int) {
        val x1 = find(x)
        val y1 = find(y)
        if (x1 == y1) return

        val (x2, y2) = if (par[x1] > par[y1]) {
            y1 to x1
        } else {
            x1 to y1
        }

        par[x2] += par[y2]
        par[y2] = x2
    }

    fun same(x: Int, y: Int): Boolean {
        return find(x) == find(y)
    }

    fun size(x: Int): Int {
        return -par[find(x)]
    }

}

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val p = readLine()!!.split(' ').map { it.toInt() }

    val uf = UnionFind(n + 1)

    repeat(m) {
        val (x, y) = readLine()!!.split(' ').map { it.toInt() }
        uf.unite(x, y)
    }

    println(p.filter { uf.same(it, p[it - 1]) }.count())
}
