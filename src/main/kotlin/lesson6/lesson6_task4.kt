package lesson6

fun main() {
    println("Загадано число от 1 до 9. У вас есть 5 попыток, что бы его угадать")
    val hiddenNumber = (1..9).random()
    var attemptNum: Int
    for (i in 1..5) {
        print("Попытка $i: ")
        attemptNum = readln().toInt()
        if (attemptNum == hiddenNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Число не угадано")
        }
    }
    println("Было загадано число: $hiddenNumber")
}
