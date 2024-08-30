package lesson16

class UserTask16 {
    private val userLogin = "Login"
    private val password = "password"

    fun isPasswordCorrect(candidate: String): Boolean = password == candidate
}

fun main() {
    val userTask16 = UserTask16()

    println("Введите пароль ")
    val candidate = readln()
    println(if (userTask16.isPasswordCorrect(candidate)) "Пароль верный" else "Пароль не верный")
}
