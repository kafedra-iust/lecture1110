import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.tan

fun main() {
    val EPS = 1e-9
    val (start, end, step) = readln().split(" ").map { it.toDouble() }
    val n = ((end - start) / step).roundToInt()
    for (i in 0..n) {
        val x = start + step * i
        print("%3.1f ".format(x))
        if (abs(cos(x))<EPS || abs(x+1.0)<EPS) {
            println(" не існує")
        } else {
            val y = f(x)
            println("%7.3f".format(x, y))
        }
    }
}

fun f(x:Double) : Double {
    // y = tg(x) / (x+1) // x!=-1 && cos(x)!=0
    return tan(x) / (x+1)
}