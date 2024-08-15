package lesson8

fun main() {
    val marvinFavoriteDish =
        arrayOf("Черные оливки", "Радиккьо", "Голубой сыр", "Грецкие орехи", "Смородиновый бальзамический уксус")
    println("Ингредиенты любимого блюда Марвина")

    marvinFavoriteDish.forEach { println(it) }

    print("Введите ингредиент для замены: ")
    val toReplace = readln()
    val indexToReplace = marvinFavoriteDish.indexOf(toReplace)
    if (indexToReplace == -1) {
        println("Нет такого ингредиента")
        // завершаем программу
        return
    }

    print("Введите название ингредиента на который хотите заменить: ")
    val replacement = readln()

    marvinFavoriteDish[indexToReplace] = replacement
    println("Готово! Вы сохранили следующий список: ${marvinFavoriteDish.joinToString(",", "[", "]")}")
}
