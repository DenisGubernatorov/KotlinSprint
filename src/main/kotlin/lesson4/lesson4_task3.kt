package lesson4

const val WINTER = "зима"
const val ACCEPTABLE_HUMIDITY = 20

fun main() {
    var isShiny = true
    var isAwningOpen = true
    var humidityPercentage = 20
    var season = "зима"

    var isFavorableConditions =
        isShiny && isAwningOpen && humidityPercentage == ACCEPTABLE_HUMIDITY && !WINTER.equals(season, true)
    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")

}