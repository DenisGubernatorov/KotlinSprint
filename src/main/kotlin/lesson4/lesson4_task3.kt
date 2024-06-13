package lesson4

const val WINTER = "зима"
const val ACCEPTABLE_HUMIDITY = 20
const val SHINY_WEATHER = true
const val AWNING_STATE_OPEN = true


fun main() {
    var isShiny = true
    var isAwningOpen = true
    var humidityPercentage = 20
    var season = "зима"

    var isFavorableConditions =
        isShiny == SHINY_WEATHER && isAwningOpen == AWNING_STATE_OPEN && humidityPercentage == ACCEPTABLE_HUMIDITY && !WINTER.equals(
            season,
            true
        )
    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")

}