package lesson14

open class LinerTwo(
    /**
     * Скорость (ед. изм.): морские узлы
     */
    private val speed: Int = 25,
    /**
     * Грузоподъемность (ед. изм.): тонны
     */
    private val payload: Int = 2000,
    /**
     * Количество пассажиров (ед. изм.): - человек
     */
    private val passengerCapacity: Int = 3000,
    /**
     * Ледокол (да/нет)
     */
    private val isIcebreaker: Boolean = false,
) {
    fun shipInfo() {
        println(
            """
            Скорость: $speed
            Грузоподъемность: $payload
            Количество пассажиров: $passengerCapacity
            Ледокол: ${
                if (isIcebreaker) "Да" else "Нет"
            }
            Метод погрузки: ${loadMethod()}
            """.trimIndent(),
        )
    }

    open fun loadMethod(): String = "горизонтальный трап со шкафута"
}

class CargoShipTwo(
    /**
     * Скорость (ед. изм.): морские узлы
     */
    speed: Int,
    /**
     * Грузоподъемность (ед. изм.): тонны
     */
    payload: Int,
    /**
     * Количество пассажиров (ед. изм.): - человек
     */
    passengerCapacity: Int,
    /**
     * Ледокол (да/нет)
     */
    isIcebreaker: Boolean,
) : LinerTwo(speed, payload, passengerCapacity, isIcebreaker) {
    override fun loadMethod(): String = "погрузочный кран"
}

class IcebreakerTwo(
    /**
     * Скорость (ед. изм.): морские узлы
     */
    speed: Int,
    /**
     * Грузоподъемность (ед. изм.): тонны
     */
    payload: Int,
    /**
     * Количество пассажиров (ед. изм.): - человек
     */
    passengerCapacity: Int,
    /**
     * Ледокол (да/нет)
     */
    isIcebreaker: Boolean,
) : LinerTwo(speed, payload, passengerCapacity, isIcebreaker) {
    override fun loadMethod(): String = "ворота со стороны кормы"
}

fun main() {
    val linerTwo = LinerTwo()
    linerTwo.shipInfo()
    val cargoShipTwo = CargoShipTwo(15, 30000, 200, false)
    cargoShipTwo.shipInfo()
    val icebreakerTwo = IcebreakerTwo(10, 1000, 500, true)
    icebreakerTwo.shipInfo()
}
