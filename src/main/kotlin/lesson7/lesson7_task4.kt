package lesson7

fun main() {
    print("Введите количество секунд, которое надо засечь: ")
    val secondsCount = readln().toInt()
    for (i in secondsCount downTo 1){// 0 не выводим
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}
