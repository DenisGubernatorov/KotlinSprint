package lesson4

const val TOTAL_TABLE_CONT = 13
fun main() {
    val todayReserved = 13
    val tomorrowReserved = 9

    println("Доступность столиков на сегодня: ${todayReserved < TOTAL_TABLE_CONT}")
    println("Доступность столиков на завтра: ${tomorrowReserved < TOTAL_TABLE_CONT}")

}