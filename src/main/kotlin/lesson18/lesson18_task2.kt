package lesson18

open class PlayingDiceL18 {
    open val maxEdgeCount = 0

    open fun getThrowResult() {}
}

class FourEdgeDice : PlayingDiceL18() {
    override val maxEdgeCount = 4

    override fun getThrowResult() {
        println((1..maxEdgeCount).random())
    }
}

class SixEdgeDice : PlayingDiceL18() {
    override val maxEdgeCount = 6

    override fun getThrowResult() {
        println((1..maxEdgeCount).random())
    }
}

class EightEdgeDice : PlayingDiceL18() {
    override val maxEdgeCount = 8

    override fun getThrowResult() {
        println((1..maxEdgeCount).random())
    }
}

fun main() {
    val dices = mutableListOf(FourEdgeDice(), SixEdgeDice(), EightEdgeDice())
    dices.forEach { it.getThrowResult() }
}
