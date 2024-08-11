package lesson6

fun main() {
    print("Введите количество секунд: ")
    val count = readln().toInt()

    for (i in 0..count) {
        Thread.sleep(1000)
    }
    println("Прошло $count секунд")
}
