import kotlin.math.abs
import kotlin.math.sin

fun main() {
    val x = readln().toDouble()
    val n = readln().toInt()
    val y = myF(x, n)
    println("y = $y")

    val y2 = myF2(x, 1e-6)
    println("y = $y2")
    println("sin = ${sin(x)}")
}

fun myF2(x: Double, EPS: Double): Double {
    var sum = 0.0
    var a = x
    var i = 0
    while (abs(a)>EPS) {
        sum += a
        i++
        a = -a*x*x/((2*i)*(2*i+1))
    }
    return sum
}

fun myF(x: Double, n:Int): Double {
    var sum = 0.0
    var a = x
    for (i in 1..n) {
        sum += a
        a = -a*x*x/((2*i)*(2*i+1))
    }
    return sum
}
