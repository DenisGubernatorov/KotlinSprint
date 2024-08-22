package lesson12

class WeatherTwo(
    private var dayTemp: Int,
    private var nightTemp: Int,
    private var isRainFall: Boolean,
) {
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
    WeatherTwo(20, 10, true).getWeather()
}
