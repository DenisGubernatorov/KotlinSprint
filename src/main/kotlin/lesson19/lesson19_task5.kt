package lesson19

enum class Sex(
    val description: String,
) {
    MALE("Мужчина"),
    FEMALE("Женщина"),
    UNKNOWN("Пол не определен при вводе"),
    ;

    companion object {
        private val genderMap =
            mapOf(
                "M" to MALE,
                "М" to MALE,
                "F" to FEMALE,
                "Ж" to FEMALE,
            )

        fun fromString(str: String): Sex = genderMap[str.uppercase()] ?: UNKNOWN
    }
}

class Human(
    val name: String,
    val sex: Sex,
)

class CardIndex {
    private var cardIndex = mutableListOf<Human>()

    fun addCard(human: Human) {
        cardIndex.add(human)
    }

    fun displayCardIndexData() {
        cardIndex.forEachIndexed { index, it ->
            println("Запись ${index + 1}:\nИмя: ${it.name}\nПол: ${it.sex.description}")
            println()
        }
    }
}

fun main() {
    val cardIndex = CardIndex()
    println(
        "Формат ввода:  имя-пол. Для ввода пола можно использовать строчные или заглавные \"м\" или \"ж\"  кириллицей, и \"m\" или \"f\" латиницей",
    )
    (1..5).forEach { item ->
        print("Введите данные $item человека в указанном формате: ")
        var data = readData()
        while (!isCorrect(data)) {
            println("Неверный формат ввода. Повторите ввод для $item записи")
            data = readData()
        }
        cardIndex.addCard(Human(data[0], Sex.fromString(data[1])))
    }
    println()
    cardIndex.displayCardIndexData()
}

fun isCorrect(readData: List<String>): Boolean = readData.size == 2

private fun readData() = readln().split("-")
