package lesson8

fun main() {
    print("Введите количество ингредиентов: ")
    val ingredientsCount = readln().toInt()

    val recipe = Array(ingredientsCount) { "" }
    for (i in recipe.indices) {
        print("Введите название $i ингредиента: ")
        recipe[i] = readln()
    }

    println(recipe.joinToString(","))
}
