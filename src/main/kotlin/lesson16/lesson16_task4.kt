package lesson16

enum class Stage {
    CONFIRMED,
    PROCESSING,
    DELIVERED,
    CANCELED,
    RETURNED,
}

class Order {
    private val orderNum = (1..10_000).random()
    private var readyStage = Stage.CONFIRMED

    fun requestToChangeStage(stage: Stage): Boolean = acceptRequestByManager(stage)

    fun getStage() {
        println(readyStage)
    }

    /**
     * Оценка возможности смены стадии менеджером и смена стадии, если возможно
     * @return - true - установлена новая стадия, false - отказ в изменении
     */
    private fun acceptRequestByManager(stage: Stage): Boolean {
        readyStage = stage
        return true
    }
}

fun main() {
    val order = Order()
    order.getStage()
    order.requestToChangeStage(Stage.PROCESSING)
    order.getStage()
}
