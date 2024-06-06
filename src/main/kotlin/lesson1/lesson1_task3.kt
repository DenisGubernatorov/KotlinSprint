package org.example.lesson1


fun main() {
    val launchYear = "1961"
    var hour = "09"
    var minute = "07"
    println(launchYear)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"
    println(String.format("%s:%s",hour,minute))

}