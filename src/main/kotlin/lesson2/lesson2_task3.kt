package org.example.lesson2

const val MINUTES_PER_HOUR = 60
const val HOURS_PER_DAY = 24

fun main() {
    val trainStartHour = 9
    val trainStartMinutes = 39
    val tripDuration = 457

    val tripHours = tripDuration / MINUTES_PER_HOUR
    val tripMinutes = tripDuration % MINUTES_PER_HOUR

    val arriveHoursTmp = trainStartHour + tripHours
    val arriveMinutesTmp = trainStartMinutes + tripMinutes
    val possibleHours = arriveMinutesTmp / MINUTES_PER_HOUR

    val arriveHours = (arriveHoursTmp + possibleHours) % HOURS_PER_DAY //  Учитываем смену суток.
    val arriveMinutes = arriveMinutesTmp % MINUTES_PER_HOUR

    println("$arriveHours:$arriveMinutes")

}