package lesson9

fun main() {
    /*
    Под индексами:
    0 - яйца
    1 - молоко
    2 - сливочное масло
     */
    val defaultServingIngredientsVal = mutableListOf(2, 50, 15)

    print("Введите количество порций: ")
    val servingCount = readln().toInt()
    val ingredientsTotalVal = defaultServingIngredientsVal.map { it * servingCount }

    println(
        "На $servingCount порций вам понадобится: Яиц – ${ingredientsTotalVal[0]}," +
            " молока – ${ingredientsTotalVal[1]}, сливочного масла – ${ingredientsTotalVal[2]}",
    )
}
