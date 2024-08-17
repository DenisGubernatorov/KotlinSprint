package lesson10

import kotlin.random.Random

private const val MACHINE = "машин"
private const val HUMANITY = "человечества"

fun main() {
    val machineScore = getScore()
    showTurnInfo(MACHINE, machineScore)
    val humanityScore = getScore()
    showTurnInfo(HUMANITY, humanityScore)
    println(getWinner(machineScore, humanityScore))
}

private fun showTurnInfo(
    player: String,
    score: Int,
) {
    println("Ход $player. Выпало: $score")
}

private fun getWinner(
    machineScore: Int,
    humanityScore: Int,
) = when {
    machineScore == humanityScore -> "В этот раз ничья!"
    machineScore > humanityScore -> "Победили машины"
    else -> "Победило человечество"
}

private fun getScore() = Random.nextInt(1, 7)
