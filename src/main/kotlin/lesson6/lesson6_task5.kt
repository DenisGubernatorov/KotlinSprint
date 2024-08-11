package lesson6

const val ATTEMPT_MAX_COUNT = 3

fun main() {
    println("-----Регистрация-----")

    print("Логин: ")
    val usrLogin = readln()

    print("Пароль: ")
    val usrPassword = readln()

    var login: String
    var password: String
    var isCorrect: Boolean

    println()
    println("-----Авторизация-----")

    do {
        print("Введите логин: ")
        login = readln()

        print("Введите пароль: ")
        password = readln()

        isCorrect = usrLogin == login && usrPassword == password
        if (!isCorrect) {
            println(if (usrLogin == login) "Неверный пароль" else "Неверный логин")
        }
    } while (!isCorrect)

    var attemptCount = 0
    var firstSummand: Int
    var secondSummand: Int
    var result: Int
    isCorrect = false

    while (attemptCount < ATTEMPT_MAX_COUNT && !isCorrect) {
        firstSummand = (1..9).random()
        secondSummand = (1..9).random()
        print("Докажите что вы не бот. Решите задачу: $firstSummand + $secondSummand = ")
        result = readln().toInt()
        if (result == firstSummand + secondSummand) {
            isCorrect = true
        } else {
            println("Неверно!")
            attemptCount++
        }
    }
    if (isCorrect) println("Добро пожаловать!") else println("Бот, мы тебя узнали")
}
