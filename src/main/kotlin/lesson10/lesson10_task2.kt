package lesson10

private const val MIN_LENGTH = 4

fun main() {
    print("Введите логин: ")
    val usrName = readln()
    print("Введите пароль: ")
    val usrPassword = readln()
    if (isCorrect(usrName) &&
        isCorrect(usrPassword)
    ) {
        println("Добро пожаловать $usrName")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

private fun isCorrect(str: String) = str.length >= MIN_LENGTH
