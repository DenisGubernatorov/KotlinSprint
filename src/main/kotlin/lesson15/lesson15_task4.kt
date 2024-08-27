package lesson15

interface Search {
    fun doSearch(
        instrument: Instrument,
        accessories: Accessories,
    )
}

class Accessories(
    val name: String,
    val storageCount: Int,
)

class Instrument(
    val name: String,
    val storageCount: Int,
) : Search {
    override fun doSearch(
        instrument: Instrument,
        accessories: Accessories,
    ) {
        println("Выполняется поиск")
    }
}
