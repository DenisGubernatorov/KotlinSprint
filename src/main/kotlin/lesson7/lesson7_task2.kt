package lesson7

fun main() {
    var smsCode: Int
    var inputCode: Int

    do {
        smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode")
        print("Введите код авторизации: ")
        inputCode = readln().toInt()
        if (smsCode == inputCode) break
    } while (true)

    println("Вы успешно авторизовались")
}
