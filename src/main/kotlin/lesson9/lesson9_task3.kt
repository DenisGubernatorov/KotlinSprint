package lesson9

fun main() {
    /*
    Под индексами:
    0 - яйца
    1 - молоко
    2 - сливочное масло
     */
    val servings = mutableListOf(2, 50, 15)

    print("Введите количество порций: ")
    val servingCount = readln().toInt()
    servings.replaceAll { it * servingCount }

    println(
        "На $servingCount порций вам понадобится: Яиц – ${servings[0]}, молока – ${servings[1]}, сливочного масла – ${servings[2]}",
    )
}
