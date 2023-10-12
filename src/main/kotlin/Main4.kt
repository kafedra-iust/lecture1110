fun main() {
    val n = readln().toInt()
    val k = count(n)
    println("k = $k")
    val s = sum(n)
    println("s = $s")
    val f = first(n)
    println("f = $f")
}

fun count(n: Int): Int {
    var m = n
    var res = 0
    while (m > 0) {
        m /= 10
        res++
    }
    return if (res==0) 1 else res
}

fun sum(n: Int) : Int {
    var m = n
    var res = 0
    while (m > 0) {
        res += m % 10
        m /= 10
    }
    return res
}

fun first(n: Int) : Int {
    var m = n
    var res = 0
    while (m > 0) {
        res = m % 10
        m /= 10
    }
    return res
}
