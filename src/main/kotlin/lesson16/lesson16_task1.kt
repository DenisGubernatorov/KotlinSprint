package lesson16

import kotlin.random.Random

class PlayingDice {
    private var diceRollResult = Random.nextInt(1, 7)

    fun showDiceRollResult() {
        println("Выпало: $diceRollResult")
    }
}

fun main() {
    val dice = PlayingDice()
    dice.showDiceRollResult()
}
