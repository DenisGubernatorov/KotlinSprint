package lesson12

import kotlin.math.roundToInt
import kotlin.random.Random

// Пусть будет летний месяц
const val DAY_MIN_TEMP = 15
const val DAY_MAX_TEMP = 35
const val NIGHT_MIN_TEMP = 5
const val NIGHT_MAX_TEMP = 25

class WeatherFive(
    val dayTemp: Int,
    val nightTemp: Int,
    val isRainFall: Boolean,
)

fun main() {
    val dayTempList = mutableListOf<Int>()
    val nightTempList = mutableListOf<Int>()
    val rainFallList = mutableListOf<Boolean>()
    val month = mutableListOf<WeatherFive>()

    repeat((1..30).count()) {
        month.add(
            // градусы Цельсия
            WeatherFive(
                Random.nextInt(DAY_MIN_TEMP, DAY_MAX_TEMP),
                Random.nextInt(NIGHT_MIN_TEMP, NIGHT_MAX_TEMP),
                Random.nextBoolean(),
            ),
        )
    }

    println(
        "Средняя дневная температура: ${
            dayTempList.addAll(month.map { it.dayTemp }).let { dayTempList }.average().roundToInt()
        }",
    )
    println(
        "Средняя ночная температура: ${
            nightTempList.addAll(month.map { it.nightTemp }).let { nightTempList }.average().roundToInt()
        }",
    )
    println(
        "Количество дождливых дней: ${
            rainFallList.addAll(month.map { it.isRainFall }).let { rainFallList.count { it } }
        }",
    )
    println()
}
