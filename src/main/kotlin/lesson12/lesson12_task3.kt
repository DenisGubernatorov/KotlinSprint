package lesson12

import kotlin.math.roundToInt


class WeatherThree(
    // А klint  ругается на то, что начинается с _
    _dayTemp: Int,
    _nightTemp: Int,
    _isRainFall: Boolean,
) {
    private var dayTemp: Int = (_dayTemp - 273.15).roundToInt()
    private var nightTemp: Int = (_nightTemp - 273.15).roundToInt()
    private var isRainFall: Boolean = _isRainFall

    fun getWeather() {
        println(
            """
            День: $dayTemp
            Ночь: $nightTemp
            Осадки: ${
                if (isRainFall) "Да" else "Нет"
            }
            """.trimIndent(),
        )
    }
}

fun main() {
    WeatherThree(300, 290, false).getWeather()
}
