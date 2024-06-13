package lesson4

fun main() {
    // 1-ый день тренировок
    val handsExFstDay = true
    val legsExFstDay = false
    val backExFstDay = false
    val pressExFstDay = true

    var trainingDay = 5
    // Считаем как обычные люди, начинаем с 1. Таким образом смена упраженений происходит по четными дням тренировки
    var isEvenTrainingDay = trainingDay % 2 == 0

    println(
        """
        Упражнения для рук:    ${!isEvenTrainingDay == handsExFstDay}
        Упражнения для ног:    ${!isEvenTrainingDay == legsExFstDay}
        Упражнения для спины:  ${!isEvenTrainingDay == backExFstDay}
        Упражнения для пресса: ${!isEvenTrainingDay == pressExFstDay}
    """.trimIndent()
    )

}