package lesson18

class Order18(
    vararg items: Any,
) {
    private val orderNumber = this.hashCode()
    private val itemsList = items.toList()

    fun showOrderItems() {
        println("Заказ $orderNumber:")
        when (itemsList.size) {
            0 -> showItemsIn()
            1 -> showItemsIn(itemsList[0])
            else -> showItemsIn(itemsList)
        }
    }

    private fun showItemsIn() {
        println("В заказе нет товаров")
    }

    private fun showItemsIn(item: Any) {
        println("Заказан товар: $item ")
    }

    private fun showItemsIn(item: List<Any>) {
        println("Заказаны следующие товары: ${item.joinToString { it.toString() }} ")
    }
}

fun main() {
    val order18Empty = Order18()
    order18Empty.showOrderItems()
    val order18 = Order18("item1")
    order18.showOrderItems()
    val order18Another = Order18(1, 2, true, 4, "item5")
    order18Another.showOrderItems()
}
