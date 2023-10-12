import kotlin.math.sin

fun main() {
    val x = readln().toDouble()
    val n = readln().toInt()

    var s1 = 0.0
    val sin = sin(x)
    var a = sin

    for (i in 1..n) {
        s1 += a
        a *= sin
    }
    println("s1 = $s1")

    var s2 = 0.0
    var b = x
    for (i in 1..n) {
        s2 += sin(b)
        b *= x
    }
    println("s2 = $s2")

    var s3 = 0.0
    var c = sin(x)
    repeat (n) {
        s3 += c
        c = sin(c)
    }
    println("s3 = $s3")
}