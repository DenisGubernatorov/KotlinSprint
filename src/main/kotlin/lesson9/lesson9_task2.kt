package lesson9

fun main() {
    val marvinFavoriteDish =
        mutableListOf("Черные оливки", "Радиккьо", "Голубой сыр")
    println("В рецепте есть базовые ингредиенты: $marvinFavoriteDish")
    print("Желаете добавить еще? ")
    val answer = readln()

    if ("Да".lowercase() == answer.lowercase()) {
        print("Какой ингредиент вы хотите добавить? ")
        marvinFavoriteDish.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $marvinFavoriteDish")
    }
}
