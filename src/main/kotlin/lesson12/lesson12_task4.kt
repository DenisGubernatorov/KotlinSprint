package lesson12

import kotlin.math.roundToInt

class WeatherFour(
    _dayTemp: Int,
    _nightTemp: Int,
    _isRainFall: Boolean,
) {
    private var dayTemp: Int = (_dayTemp - 273.15).roundToInt()
    private var nightTemp: Int = (_nightTemp - 273.15).roundToInt()
    private var isRainFall: Boolean = _isRainFall

    init {
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
    WeatherFour(300, 290, false)
}
