package lesson20

fun main() {
    val elements = mutableListOf("Элемент0", "Элемент1", "Элемент2", "Элемент3", "Элемент4")

    elements
        .map {
            { println("Нажат элемент $it") }
        }.forEachIndexed { index, it ->
            if (index % 2 == 0) {
                it()
            }
        }
}
