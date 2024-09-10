package lesson19

enum class Category {
    CLOTHES,
    STATIONERY,
    OTHER,
    ;

    fun getDescription(): String =
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

    fun printItemInfo() {
        println("Название: $name\nИД:$id\nКатегория: ${category.getDescription()}")
    }
}

fun main() {
    Item19("Item1", Category.CLOTHES).printItemInfo()
    println()
    Item19("Item2", Category.STATIONERY).printItemInfo()
    println()
    Item19("Item3", Category.OTHER).printItemInfo()
}
