package lesson5

import java.time.LocalDate

const val ADULT = 18

fun main() {
    val currentYear = LocalDate.now().year
    print("Введите ваш год рождения в формате YYYY (например 1900): ")
    val birthYear = readln().toInt()
    if (currentYear - birthYear >= ADULT) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}
