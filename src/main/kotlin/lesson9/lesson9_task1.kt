package lesson9

fun main() {
    val marvinFavoriteDish =
        listOf("Черные оливки", "Радиккьо", "Голубой сыр", "Грецкие орехи", "Смородиновый бальзамический уксус")
    println("В рецепте есть следующие ингредиенты: $marvinFavoriteDish")
    marvinFavoriteDish.forEach { println(it) }
}
