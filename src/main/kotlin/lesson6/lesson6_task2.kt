package lesson6

fun main() {
    print("Введите количество секунд: ")
    val count = readln().toInt()
    Thread.sleep((1000 * count).toLong())
    println("Прошло $count секунд")
}
