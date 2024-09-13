package lesson21

import java.io.File

fun main() {
    fun File.readTextAndSend(str: String) {
        val strToWrite = str.lowercase().trim()
        writeText(
            when {
                exists() -> {
                    val oldText = readText()
                    "$strToWrite $oldText"
                }

                else -> {
                    strToWrite
                }
            },
        )
    }

    val file = File("KS-21-04-file.txt")
    file.readTextAndSend(readln())
    file.readTextAndSend(readln())
}
