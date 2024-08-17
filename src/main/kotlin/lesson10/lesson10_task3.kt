package lesson10

fun main() {
    print("Введите длину пароля: ")
    println("Ваш пароль: ${generatePassword(readln().toInt())}")
}

/**
 * Функция не гарантирует, что в начале или конце не будет пробела. Из-за чего визуально может казаться, что в пароле
 * меньше знаков, чем указали
 */
private fun generatePassword(passwordLength: Int): String {
    val range = "123456789!\"#\$%&'()*+,-./ "
    val tmpPassword = CharArray(passwordLength)

    repeat(passwordLength) {
        tmpPassword[it] = range.random()
    }
    tmpPassword.shuffle()

    return String(tmpPassword)
}
