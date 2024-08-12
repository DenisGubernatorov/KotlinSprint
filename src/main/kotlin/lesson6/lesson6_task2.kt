package lesson6

const val COUNT_END = 1

fun main() {
    var count = readln().toInt()
    while (count > COUNT_END) {
        Thread.sleep(1000)
        println("Осталось секунд: ${--count}")
    }
    println("Время вышло")
}
