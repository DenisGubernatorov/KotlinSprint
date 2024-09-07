package lesson19

enum class Category {
    CLOTHES,
    STATIONERY,
    OTHER,
    ;

    fun description(): String =
        when (this) {
            CLOTHES -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            OTHER -> "Остальное"
        }
}

class Item19(
    private val name: String,
    private var category: Category,
) {
    private val id = this.hashCode()

    fun itemDescription() {
        println("Название: $name\nИД:$id\nКатегория: ${category.description()}")
    }
}

fun main() {
    Item19("Item1", Category.CLOTHES).itemDescription()
    println()
    Item19("Item2", Category.STATIONERY).itemDescription()
    println()
    Item19("Item3", Category.OTHER).itemDescription()
}
