package lesson5

const val FIRST_AUTH_NUMBER = 3
const val SECOND_AUTH_NUMBER = 9
const val CORRECT_ANSWER = 12

fun main() {
    print("Для авторизации введите результат выражения $FIRST_AUTH_NUMBER + $SECOND_AUTH_NUMBER = ")
    val result = readln().toInt()
    when (result) {
        CORRECT_ANSWER -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}
