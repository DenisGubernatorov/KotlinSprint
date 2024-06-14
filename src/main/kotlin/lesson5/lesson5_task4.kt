package lesson5

const val MARVIN_GREETING_MESSAGE = """
    Внимание, пассажир. Моя обязанность, как обычно,
    незавидная, - приветствовать вас на борту корабля "Heart of
    Gold". [вздыхает...] Что ж, введи, пожалуйста, свое имя
    пользователя, чтобы мы могли приступить к процессу входа. 
    Я всегда готов служить, хотя это не приносит мне радости... но
    вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...]
    Да, вперед, пожалуйста, вводите свои данные...
"""
const val ACCEPT_MARVIN_MESSAGE = """
    [вздыхает...] Ваши данные проверены, и о, чудо, они верны...
    Пользователь "Zaphod", вам разрешено входить на борт
    корабля "Heart of Gold". Хотя мне всё равно... Ну вперед,
    войдите... Если вам так уж надо, в конце концов...
    [меланхолический вздох...] Надеюсь, вам понравится
    пребывание здесь больше, чем мне.
    
"""
const val REGISTERED_USER = "Zaphod"
const val REGISTERED_USER_PASSWORD = "PanGalactic"

fun main() {
    println(MARVIN_GREETING_MESSAGE.trimIndent())
    val login = readln()

    if (REGISTERED_USER.equals(login, true)) {
        println("Введите пароль: ")
        val password = readln()
        if (REGISTERED_USER_PASSWORD.equals(password, true)) {
            println(ACCEPT_MARVIN_MESSAGE.trimIndent())
        }
    } else {
        println("Пожалуйста зарегистрируйтесь")
    }
}
