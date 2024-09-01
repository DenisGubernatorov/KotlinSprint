package lesson16

enum class Stage {
    CONFIRMED,
    PROCESSING,
    DELIVERED,
    CANCELED,
    RETURNED,
}

class Order(
    private val orderNum: Int,
) {
    private var readyStage = Stage.CONFIRMED

    fun requestToChangeStage(stage: Stage): Boolean = acceptRequestByManager(stage)

    fun getStage() {
        println("Заказ $orderNum на стадии $readyStage")
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
    val order = Order(45)
    order.getStage()
    order.requestToChangeStage(Stage.PROCESSING)
    order.getStage()
}
