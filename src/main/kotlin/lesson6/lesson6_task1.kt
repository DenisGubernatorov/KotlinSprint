package lesson6

var usrPassword: String = ""
var usrLogin: String = ""

fun main() {
    println("-----Регистрация-----")

    print("Логин: ")
    usrLogin = readln()

    print("Пароль: ")
    usrPassword = readln()

    var login: String
    var password: String
    var isCorrect: Boolean
    do {
        println()
        println("-----Авторизация-----")

        print("Введите логин: ")
        login = readln()

        print("Введите пароль: ")
        password = readln()

        // интересный момент, что в Kotlin у ==, "под капотом" equals
        isCorrect = usrLogin == login && usrPassword == password
        if (!isCorrect) {
            println(if (usrLogin == login) "Неверный пароль" else "Неверный логин")
        }
    } while (!isCorrect)
    println("Авторизация прошла успешно")
}
