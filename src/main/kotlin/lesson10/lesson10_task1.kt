package lesson10

import kotlin.random.Random

private const val MACHINE = "машин"
private const val HUMANITY = "человечества"

fun main() {
    val machineScore = showAndGetScore(MACHINE)
    val humanityScore = showAndGetScore(HUMANITY)
    println(getWinner(machineScore, humanityScore))
}

private fun getWinner(
    machineScore: Int,
    humanityScore: Int,
) = when {
    machineScore == humanityScore -> "В этот раз ничья!"
    machineScore > humanityScore -> "Победили машины"
    else -> "Победило человечество"
}

private fun showAndGetScore(player: String): Int {
    val score = Random.nextInt(1, 7)
    println("Ход $player. Выпало: $score")
    return score
}
