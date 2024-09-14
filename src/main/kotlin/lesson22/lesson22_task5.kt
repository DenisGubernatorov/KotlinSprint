package lesson22

import java.time.LocalDateTime

data class GalacticGuide(
    val eventName: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distance: Double,
)

fun main() {
    val galacticGuide =
        GalacticGuide(
            "Земля",
            "Уничтожение для строительства межгалактической магистрали",
            LocalDateTime.now(),
            0.0,
        )
    println("${galacticGuide.component1()}\n${galacticGuide.component2()}\n${galacticGuide.component3()}\n${galacticGuide.component4()}\n ")
}
