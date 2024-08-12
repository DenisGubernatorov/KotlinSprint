package lesson7

const val MIN_PASSWORD_LENGTH = 6

fun main() {
    val range = ('A'..'Z').toList() + ('a'..'z').toList() + (0..9).toList()

    var passwordLength: Int
    while (true) {
        print("Введите длину пароля (6 символов минимум)")
        passwordLength = readln().toInt()
        if (passwordLength < MIN_PASSWORD_LENGTH) println("Длина пароля не должна быть меньше 6 символов") else break
    }

    var generatedPassword = ""
    for (i in 0 until passwordLength) generatedPassword += range.random()
    println(generatedPassword)
}
