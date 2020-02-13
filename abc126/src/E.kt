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
            Pair(y1, x1)
        } else {
            Pair(x1, y1)
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
    val cs = (0 until m).map {
        val (x, y, z) = readLine()!!.split(' ').map { it.toInt() }
        Triple(x, y, z)
    }

    val uf = UnionFind(n + 1)

    for (i in cs.indices) {
        uf.unite(cs[i].first, cs[i].second)
    }

    val set = mutableSetOf<Int>()

    for (i in 1..n) {
        set.add(uf.find(i))
    }

    println(set.size)
}
