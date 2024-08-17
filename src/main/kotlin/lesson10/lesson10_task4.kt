package lesson10

import kotlin.random.Random

private const val MACHINE = "машин"
private const val HUMANITY = "человечества"
private const val MIN_CUBE_VAL = 1
private const val MAX_CUBE_VAL = 6
private var humanityWinCount = 0

fun main() {
    do {
        doTurn()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
    } while ("Да".lowercase() == readln().lowercase())

    println("Человечество выиграло $humanityWinCount раз")
}

private fun doTurn() {
    val machineScore = getScore()
    showTurnInfo(MACHINE, machineScore)
    val humanityScore = getScore()
    showTurnInfo(HUMANITY, humanityScore)

    when {
        machineScore > humanityScore -> println("Победили машины")
        machineScore < humanityScore -> {
            humanityWinCount++
            println("Победило человечество")
        }

        else -> println("В этот раз ничья!")
    }
}

private fun showTurnInfo(
    player: String,
    score: Int,
) {
    println("Ход $player. Выпало: $score")
}

private fun getScore() = Random.nextInt(MIN_CUBE_VAL, MAX_CUBE_VAL + 1)
