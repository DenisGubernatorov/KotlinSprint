package org.example.lesson1

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds - hours * 3600) / 60
    val seconds = (totalSeconds - hours * 3600) - minutes * 60
    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}