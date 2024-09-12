package lesson21

fun main() {
    fun String.vowelCount(): Int =
        this.uppercase().count {
            it in setOf('A', 'E', 'I', 'O', 'U')
        }
    println(readln().vowelCount())
}
