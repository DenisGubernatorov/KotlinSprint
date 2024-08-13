package lesson8

fun main() {
    val marvinFavoriteDish =
        arrayOf("Черные оливки", "Радиккьо", "Голубой сыр", "Грецкие орехи", "Смородиновый бальзамический уксус")
    println("Ингредиенты любимого блюда Марвина")

    marvinFavoriteDish.forEach { println(it) }

    print("Введите ингредиент для замены: ")
    val toReplace = readln()
    if (!marvinFavoriteDish.any { it.equals(toReplace, ignoreCase = true) }) {
        println("Нет такого ингредиента")
        // завершаем программу
        return
    }

    print("Введите название ингредиента на который хотите заменить: ")
    val replacement = readln()
    val indexToReplace = marvinFavoriteDish.indexOfFirst { it.equals(toReplace,ignoreCase = true) }
    marvinFavoriteDish[indexToReplace] = replacement
    println("Готово! Вы сохранили следующий список: ${marvinFavoriteDish.joinToString(",","[","]")}")
}
