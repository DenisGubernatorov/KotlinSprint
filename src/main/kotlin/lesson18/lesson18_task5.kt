package lesson18

class Screen {
    fun draw(
        x: Int,
        y: Int,
        figure18: Figure18,
    ) {
        draw(x.toFloat(), y.toFloat(), figure18)
    }

    fun draw(
        x: Float,
        y: Float,
        figure18: Figure18,
    ) {
        println(
            "Рисуем ${figure18.description}\nцентр по координатам x: $x y:$y\nЦвет:${figure18.color}\nТолщина линий:${figure18.lineThin}\nЗаполнение:${figure18.fill} ",
        )
        println()
    }
}

abstract class Figure18(
    val color: String,
    val lineThin: Int,
    val fill: Boolean,
) {
    abstract val description: String
}

class Point18(
    color: String,
) : Figure18(color, 1, true) {
    override val description = "Точка"
}

class
Square18(
    private val sideA: Int,
    private val sideB: Int,
    color: String,
    lineThin: Int,
    fill: Boolean,
) : Figure18(color, lineThin, fill) {
    override val description = "Квадрат"
}

class Circle18(
    private val radius: Int,
    color: String,
    lineThin: Int,
    fill: Boolean,
) : Figure18(color, lineThin, fill) {
    override val description = "Круг"
}

fun main() {
    val screen = Screen()

    val point = Point18("Red")
    val square = Square18(5, 5, "Blue", 2, false)
    val circle = Circle18(10, "Green", 1, true)

    screen.draw(10, 20, point)
    screen.draw(30.5f, 40.5f, square)
    screen.draw(50, 60, circle)
}
