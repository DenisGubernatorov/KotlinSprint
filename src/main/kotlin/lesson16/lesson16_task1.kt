package lesson16

class PlayingDice {
    private var diceRollResult = (1..6).random()

    fun showDiceRollResult() {
        println("Выпало: $diceRollResult")
    }
}

fun main() {
    val dice = PlayingDice()
    dice.showDiceRollResult()
}
