package lesson7

var password = ""

fun main() {
    for (i in 0..5) {
        password += if (i % 2 == 0) ('a'..'z').random() else (1..9).random()
    }
    println(password)
}
