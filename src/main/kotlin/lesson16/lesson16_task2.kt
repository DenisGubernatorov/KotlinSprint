package lesson16

import kotlin.math.pow

private const val PI = 3.14

class Circle(
    private val radius: Int,
) {
    fun getCircleLength(): Double = 2 * PI * radius

    fun getCircleSquare(): Double = PI * radius.toDouble().pow(2.0)
}

fun main() {
    val circle = Circle(4)
    println(circle.getCircleLength())
    println(circle.getCircleSquare())
}
