import java.time.LocalDateTime

abstract class WeatherStationStats(
    open val stationId: String,
    open val dateTime: LocalDateTime,
)

data class Temperature(
    override val stationId: String,
    override val dateTime: LocalDateTime,
    val value: Double,
) : WeatherStationStats(stationId, dateTime)

data class PrecipitationAmount(
    override val stationId: String,
    override val dateTime: LocalDateTime,
    val value: Double,
) : WeatherStationStats(stationId, dateTime)

data class Freezing(
    override val stationId: String,
    override val dateTime: LocalDateTime,
    val hasFreezing: Boolean,
) : WeatherStationStats(stationId, dateTime)

class WeatherServer {
    fun sendMessage(message: WeatherStationStats) {
        when (message) {
            is Temperature -> sendTemperatureData(message)
            is PrecipitationAmount -> sendPrecipitationData(message)
            else -> println("Ошибка отправки данных с ${message.stationId} Неизвестный тип данных")
        }
    }

    private fun sendTemperatureData(temperature: Temperature) {
        println("Отправка значения температуры на сервер: станция ${temperature.stationId}, ")
    }

    private fun sendPrecipitationData(precipitation: PrecipitationAmount) {
        println("Отправка количества осадков на сервер: ${precipitation.stationId}")
    }
}

fun main() {
    val dateNow = LocalDateTime.now()
    val temperatureData = Temperature("Station1", dateNow, 25.5)
    val precipitationData = PrecipitationAmount("Station1", dateNow, 10.2)
    val freezing = Freezing("station1", dateNow, false)

    val server1 = WeatherServer()
    server1.sendMessage(temperatureData)
    server1.sendMessage(precipitationData)
    server1.sendMessage(freezing)
}
