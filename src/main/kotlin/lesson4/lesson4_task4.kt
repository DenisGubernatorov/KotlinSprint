package lesson4

fun main() {
    // 1-ый день тренировок
    val handsExFstDay = true
    val legsExFstDay = false
    val backExFstDay = false
    val pressExFstDay = true

    var trainingDay = 5
    // Считаем как обычные люди, начинаем с 1. Таким образом смена упраженений происходит по четными дням тренировки
    var isEvenTrainingDay = trainingDay.rem(2) == 0
    var handsEx = isEvenTrainingDay xor handsExFstDay
    var legsEx = isEvenTrainingDay xor legsExFstDay
    var backEx = isEvenTrainingDay xor backExFstDay
    var pressEx = isEvenTrainingDay xor pressExFstDay

    println(
        """
        Упражнения для рук:    $handsEx
        Упражнения для ног:    $legsEx
        Упражнения для спины:  $backEx
        Упражнения для пресса: $pressEx
    """.trimIndent()
    )

}