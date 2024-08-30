package lesson15

interface Search {
    fun doSearch(
        instrument: Instrument,
        accessories: Accessories,
    )
}

abstract class Item(
    val name: String,
    val storageCount: Int,
)

class Accessories(
    name: String,
    storageCount: Int,
) : Item(name, storageCount)

class Instrument(
    name: String,
    storageCount: Int,
) : Item(name, storageCount),
    Search {
    override fun doSearch(
        instrument: Instrument,
        accessories: Accessories,
    ) {
        println("Выполняется поиск")
    }
}
