package lesson3

fun main() {
    val receivedData = "D2-D4;16"

    val turnFrom = receivedData.substring(0,2)
    println(turnFrom)

    val turnTo = receivedData.substring(3,5)
    println(turnTo)

    val turnCount = receivedData.substring(6)
    println(turnCount)

}