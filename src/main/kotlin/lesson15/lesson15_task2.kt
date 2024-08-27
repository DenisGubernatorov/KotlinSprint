package lesson15

abstract class WeatherStationStats {
    abstract fun doSendData()
}

class Temperature : WeatherStationStats() {
    override fun doSendData() {
        println("Отправляем температуру")
    }
}

class PrecipitationAmount : WeatherStationStats() {
    override fun doSendData() {
        println("Отправляем количество осадков ")
    }
}

fun main() {
    val temperature = Temperature()
    temperature.doSendData()
    val precipitationAmount = PrecipitationAmount()
    precipitationAmount.doSendData()
}
