package lesson9

fun main() {
    print("Введите 5 ингредиентов через запятую. После запятой должен быть пробел. Например (ингредиент 1, ингредиент 2, и так далее): ")
    val userIngredients = readln()
    val ingredientsList = userIngredients.split(", ").sorted()

    println(ingredientsList)
}
