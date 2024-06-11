package lesson3

fun main() {
    var fieldFrom = "E"
    var cellFrom = 2
    var fieldTo = "E"
    var cellTo = 4
    var turnCount = 1
    println("$fieldFrom$cellFrom-$fieldTo$cellTo;$turnCount")

    fieldFrom = "D"
    cellFrom = 2
    fieldTo = fieldFrom
    turnCount++
    println("$fieldFrom$cellFrom-$fieldTo${cellFrom + 1};$turnCount")

}