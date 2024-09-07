package lesson18

import kotlin.math.pow

abstract class PackageShape(
    protected val length: Double,
    protected val width: Double,
    protected val height: Double,
) {
    constructor(
        side: Double,
    ) : this(side, side, side)

    abstract fun getSurfaceArea(): Double
}

class Cube(
    side: Double,
) : PackageShape(side) {
    override fun getSurfaceArea(): Double = 6 * length.pow(2)
}

class RectangularPrism(
    length: Double,
    width: Double,
    height: Double,
) : PackageShape(length, width, height) {
    override fun getSurfaceArea(): Double = 2 * (length * width + width * height + length * height)
}

fun main() {
    println(Cube(5.0).getSurfaceArea())

    println(RectangularPrism(5.0, 6.0, 7.0).getSurfaceArea())
}
