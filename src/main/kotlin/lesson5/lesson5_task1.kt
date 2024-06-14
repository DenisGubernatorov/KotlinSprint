package lesson5

fun main() {
    val firstAuthNumber = 3
    val secondAuthNumber = 9
    val correctAnswer = 12

    print("Для авторизации введите результат выражения $firstAuthNumber + $secondAuthNumber = ")
    val result = readln().toInt()
    if (result == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
