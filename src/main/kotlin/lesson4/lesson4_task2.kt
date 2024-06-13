package lesson4

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100
const val AVERAGE_VIEW_NAME = "Average"

fun main() {
    var cargoWeight: Int
    var cargoVolume: Int

    cargoWeight = 20
    cargoVolume = 80
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории '$AVERAGE_VIEW_NAME':" +
            "${cargoWeight > AVERAGE_MIN_WEIGHT && cargoWeight <= AVERAGE_MAX_WEIGHT && cargoVolume < AVERAGE_MAX_VOLUME}")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории '$AVERAGE_VIEW_NAME':" +
            "${cargoWeight > AVERAGE_MIN_WEIGHT && cargoWeight <= AVERAGE_MAX_WEIGHT && cargoVolume < AVERAGE_MAX_VOLUME}")
}