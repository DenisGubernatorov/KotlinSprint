package lesson22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regularBook = RegularBook("regBook1", "Author1")
    val regularBook1 = RegularBook("regBook1", "Author1")

    val dataBook = DataBook("dataBook1", "dAuthor1")
    val dataBook1 = DataBook("dataBook1", "dAuthor1")

    println(regularBook == regularBook1)
    println(dataBook == dataBook1)
    /*
    Оператор == "под капотом" использует equals. В случае для обычных классов, наследников Object, сравниваются ссылки на объекты, если мы сами его
    не переопределяем.
    Для data классов автоматически переопределяется eqauls, на основе свойств переданных в конструкторе. И сравнивает их значение. Таким образом,
    если у двух объектов data класса одинаковые значения свойств, то они считаются одинаковыми. Это накладывает ограничения на первичный конструктор.
    В нем должно быть определено, как минимум, одно свойство. Также, свойства, объявленные в теле data класса, а не в конструкторе, не участвуют
    в переопределении equals
     */
}
