package lesson3

fun main() {
    var messageTime = "день"
    var userName = "Denis"
    var mainMessage = "Добрый ${messageTime}, ${userName}!"
    println(mainMessage)

    messageTime = "вечер"
    userName = "Marvin"
    mainMessage = "Добрый ${messageTime}, ${userName}!"
    println(mainMessage)
}