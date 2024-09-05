package lesson18

abstract class PlayingDiceL18 {
    open val maxEdgeCount = 0

    fun getThrowResult() {
        println((1..maxEdgeCount).random())
    }
}

class FourEdgeDice : PlayingDiceL18() {
    override val maxEdgeCount = 4
}

class SixEdgeDice : PlayingDiceL18() {
    override val maxEdgeCount = 6
}

class EightEdgeDice : PlayingDiceL18() {
    override val maxEdgeCount = 8
}

fun main() {
    val dices = mutableListOf(FourEdgeDice(), SixEdgeDice(), EightEdgeDice())
    dices.forEach { it.getThrowResult() }
}
