package lesson4

const val FULL_CREW = 70
const val MINIMUM_CREW = 55
const val PROVISIONS_MINIMUM = 50
fun main() {
    print("Наличие повреждений корпуса (Да/Нет): ")
    val hasDamage = readBoolean()

    print("Текущий состав экипажа: ")
    val crewCount: Int = readIntWithTry()


    print("Количество ящиков с провизией на борту: ")
    val provisions: Int = readIntWithTry()


    print("Длагоприятность метеоусловий (Да/Нет) ")
    val isOptimalWeather = readBoolean()

    val canStart =
        (!hasDamage && crewCount in MINIMUM_CREW..FULL_CREW && provisions > PROVISIONS_MINIMUM && isOptimalWeather)
                || (hasDamage && crewCount == FULL_CREW && provisions >= PROVISIONS_MINIMUM && isOptimalWeather)
    println("Можем плыть? $canStart")
}

private fun readIntWithTry(): Int {
    return try {
        readln().toInt()
    } catch (e: NumberFormatException) {
        println("Необходимо ввести число")
        readIntWithTry()
    }
}

private fun readBoolean(): Boolean {
    val str = readln()
    return when {
        str.equals("да", ignoreCase = true) || str.equals("lf", ignoreCase = true) -> true
        str.equals("нет", ignoreCase = true) || str.equals("ytn", ignoreCase = true) -> false
        else -> {
            println("Некорректный ввод. Введите \"Да\" или \"Нет\"")
            readBoolean()
        }
    }

}