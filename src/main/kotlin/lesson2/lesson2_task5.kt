package org.example.lesson2

import kotlin.math.pow

fun main() {
    val initialAmount = 70_000
    val yearPercent = 16.7
    val yearCount = 20

    val amountWithPercent = initialAmount * (1 + yearPercent / 100).pow(yearCount)
    println(String.format("%.3f",amountWithPercent))
}