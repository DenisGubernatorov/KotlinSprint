package lesson9

fun main() {
    val ingredients = sortedSetOf<String>()
    for (i in 1..5) {
        print("Введите ингредиент $i: ")
        ingredients.add(readln())
    }

    val result =
        ingredients.joinToString(", ") { item ->

            if (item == ingredients.first()) {
                item.replaceFirstChar { it.uppercaseChar() }
            } else {
                item
            }
        }
    println(result)
}
