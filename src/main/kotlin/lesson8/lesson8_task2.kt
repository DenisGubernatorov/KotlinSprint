package lesson8

fun main() {
    val marvinFavoriteDish =
        arrayOf("Черные оливки", "Радиккьо", "Голубой сыр", "Грецкие орехи", "Смородиновый бальзамический уксус")
    print("Введите название ингредиента: ")
    val ingredient = readln()
    var isFound = false
    for (candidate in marvinFavoriteDish) {
        if (ingredient.lowercase() == candidate.lowercase()) {
            isFound = true
            break
        }
    }
    if (isFound) println("Ингредиент [$ingredient] в рецепте есть") else println("Такого ингредиента в рецепте нет")
}
