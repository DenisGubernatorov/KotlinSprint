package lesson7

fun main() {
    print("Введите число: ")
    val toNumber = readln().toInt()
    for (i in 0..toNumber step 2) {
        println(i)
    }
}
