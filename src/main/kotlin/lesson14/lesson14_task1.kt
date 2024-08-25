package lesson14

open class Liner(
    /**
     * Скорость (ед. изм.): морские узлы
     */
    val speed: Int = 25,
    /**
     * Грузоподъемность (ед. изм.): тонны
     */
    val payload: Int = 2000,
    /**
     * Количество пассажиров (ед. изм.): - человек
     */
    val passengerCapacity: Int = 3000,
    /**
     * Ледокол (да/нет)
     */
    val isIcebreaker: Boolean = false,
)

class CargoShip(
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
) : Liner(speed, payload, passengerCapacity, isIcebreaker)

class Icebreaker(
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
) : Liner(speed, payload, passengerCapacity, isIcebreaker)

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip(15, 30000, 200, false)
    val icebreaker = Icebreaker(10, 1000, 500, true)
}
