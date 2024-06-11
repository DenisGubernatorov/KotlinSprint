package lesson3

fun main() {
    val receivedData = "D2-D4;16"
    val splitData = receivedData.split("-", ";")

    val turnFrom = splitData[0]
    println(turnFrom)

    val turnTo = splitData[1]
    println(turnTo)

    val turnCount = splitData[2]
    println(turnCount)

}