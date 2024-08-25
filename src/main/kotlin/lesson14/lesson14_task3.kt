package lesson14

import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun getSquare(): Double

    abstract fun getPerimeter(): Double
}

class Circle(
    color: String,
    private val radius: Long,
) : Figure(color) {
    val PI: Double = 3.14

    override fun getSquare(): Double = PI * radius.toDouble().pow(2.0)

    override fun getPerimeter(): Double = 2 * PI * radius
}

class Rectangle(
    color: String,
    private val sideA: Double,
    private val sideB: Double,
) : Figure(color) {
    override fun getSquare(): Double = sideA * sideB

    override fun getPerimeter(): Double = 2 * (sideA + sideB)
}

fun main() {
    val figures = mutableListOf<Figure>()
    figures.add(Circle("black", 10))
    figures.add(Circle("white", 15))
    figures.add(Circle("black", 20))
    figures.add(Circle("white", 25))

    figures.add(Rectangle("black", 10.0, 20.0))
    figures.add(Rectangle("white", 15.0, 25.0))
    figures.add(Rectangle("black", 20.0, 30.0))
    figures.add(Rectangle("white", 25.0, 35.0))

    println(
        "Сумма периметров всех черных фигур ${
            figures.filter { "black" == it.color }.sumOf { it.getPerimeter() }
        }",
    )

    println(
        "Сумма площадей всех белых фигур ${
            figures.filter { "white" == it.color }.sumOf { it.getSquare() }
        }",
    )
}
