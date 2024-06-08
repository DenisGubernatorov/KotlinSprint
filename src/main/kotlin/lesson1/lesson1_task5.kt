package org.example.lesson1

const val SECONDS_PER_HOUR = 3600
const val SECONDS_PER_MINUTES = 60

fun main() {

    val totalSeconds = 6480
    val hours = totalSeconds / SECONDS_PER_HOUR
    val minutes = (totalSeconds - hours * SECONDS_PER_HOUR) / SECONDS_PER_MINUTES
    val seconds = (totalSeconds - hours * SECONDS_PER_HOUR) - minutes * SECONDS_PER_MINUTES
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}