fun main() {
    val n = readln().toInt()
    var s = 0.0
    var sign = 1.0
    for (k in 1..n) {
        sign = -sign
        val a = sign / ((2*k+1)*k)
        s += a
    }
    println("s = $s")
}