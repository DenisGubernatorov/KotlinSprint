package lesson12

class Weather {
    var dayTemp = 20
    var nightTemp = 10
    var isRainFall = false

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
    val dayOne = Weather()
    dayOne.dayTemp = 30
    dayOne.nightTemp = 15
    dayOne.isRainFall = true
    dayOne.getWeather()

    val dayTwo = Weather()
    dayTwo.dayTemp = 25
    dayTwo.nightTemp = 5
    dayTwo.isRainFall = false
    dayTwo.getWeather()
}
