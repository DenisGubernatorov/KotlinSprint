package lesson22

class RegularBook1(
    val title: String,
    val author: String,
)

data class DataBook1(
    val title: String,
    val author: String,
)

fun main() {
    println(RegularBook1("Title", "Author"))
    println(DataBook1("Title", "Author"))
}

/*
Разница в том, что стандартная реализация toString для обычных классов выводит на экран имя класса и хеш-код.
А для data классов toString автоматические переопределяется и выводит значения всех заданных в конструкторе
 */
