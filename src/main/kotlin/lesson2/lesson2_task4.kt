package org.example.lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 1.2

    println("Дополнительно кристаллической руды:${(crystalOre * buffPercent - crystalOre).toInt()}")
    println("Дополнительно железной руды:$${(ironOre * buffPercent - ironOre).toInt()}")

}