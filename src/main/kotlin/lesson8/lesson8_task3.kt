package lesson8

fun main() {
    val marvinFavoriteDish =
        arrayOf("Черные оливки", "Радиккьо", "Голубой сыр", "Грецкие орехи", "Смородиновый бальзамический уксус")
    print("Введите название ингредиента: ")
    val ingredient = readln()

    if (marvinFavoriteDish.any {
            it.equals(
                ingredient,
                ignoreCase = true,
            )
        }
    ) {
        println("Ингредиент [$ingredient] в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
