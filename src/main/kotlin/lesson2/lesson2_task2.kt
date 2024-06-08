package org.example.lesson2

fun main() {
    val workersCount = 50
    val workersSalary = 30_000

    val traineeCount = 30
    val traineeSalary = 20_000

    val paymentWorkers = workersCount * workersSalary
    println(paymentWorkers)

    val totalPaymentIncludeTrainee = traineeSalary * traineeCount + paymentWorkers
    println(totalPaymentIncludeTrainee)

    val averageSalary = totalPaymentIncludeTrainee / (workersCount + traineeCount)
    println(averageSalary)

}