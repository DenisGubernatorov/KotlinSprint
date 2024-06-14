package lesson5

import kotlin.random.Random

const val MESSAGE = "Введите %s число в диапазоне от 1 до 42: "
const val VICTORY = "Вы угадали все числа! ДЖЕКПОТ!"
const val PARTIAL_VICTORY_TWO = "Вы угадали 2 числа и выиграли крупный приз!"
const val PARTIAL_VICTORY_ONE = "Вы угадали одно число и выиграли утешительный приз!"
const val LOOSE = "К сожаление вы не угадали ни одного числа"
const val RANGE_FROM = 1
const val RANG_TO = 43

fun main() {
    val numbers = setOf(getRandom(), getRandom(), getRandom())
    val entered = mutableListOf<Int>()

    repeat(3) { index ->
        print(MESSAGE.format(index + 1))
        entered.add(readln().toInt())
    }

    val intersectedCount = numbers.intersect(entered.toSet()).toSet().size
    when (intersectedCount) {
        3 -> println(VICTORY)
        2 -> println(PARTIAL_VICTORY_TWO)
        1 -> println(PARTIAL_VICTORY_ONE)
        else -> println(LOOSE)
    }

    println("Выигрышные числа $numbers")
}

fun getRandom(): Int = Random.nextInt(RANGE_FROM, RANG_TO)
