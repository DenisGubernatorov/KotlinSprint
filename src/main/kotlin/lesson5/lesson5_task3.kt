package lesson5

const val MESSAGE = "Введите %s число в диапазоне от 1 до 42: "
const val VICTORY = "Поздравляем Вы выиграли главный приз!"
const val PARTIAL_VICTORY = "Вы выиграли утешительный приз!"
const val LOOSE = "Неудача!"

fun main() {
    val firstNumber = 15
    val secondNumber = 34

    print(MESSAGE.format("первое"))
    val enteredOne = readln().toInt()

    print(MESSAGE.format("второе"))
    val enteredTwo = readln().toInt()

    when {
        (enteredOne == firstNumber) &&
            (enteredTwo == secondNumber) ||
            (enteredOne == secondNumber) &&
            (enteredTwo == firstNumber) -> {
            println(VICTORY)
        }

        (enteredOne == firstNumber) ||
            (enteredTwo == firstNumber) ||
            (enteredOne == secondNumber) ||
            (enteredTwo == secondNumber) -> {
            println(PARTIAL_VICTORY)
        }

        else -> {
            println(LOOSE)
        }
    }
    println("Были загаданы числа $firstNumber и $secondNumber")
}
