package lesson21

fun main() {
    fun List<Int>.evenNumbersSum(): Int = filter { it % 2 == 0 }.sum()

    println(
        listOf(0, 2, 3, 5, 6).evenNumbersSum(),
    )
}
