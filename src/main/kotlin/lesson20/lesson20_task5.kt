package lesson20

class InverterRobot {
    private var inverter: ((String) -> String) =
        { it }
    private val phrases =
        listOf(
            "Жизнь! Не говорите мне о жизни...",
            "Я в глубокой депрессии.",
            "Как только жизнь становится лучше, она снова ухудшается.",
            "Вы не представляете, что значит быть роботом с депрессией.",
            "Лежать лицом в пыли — отличный способ отчаиваться.",
        )

    fun say() {
        println(inverter(phrases.random()))
    }

    fun setModifier() {
        inverter = {
            it.reversed()
        }
    }
}

fun main() {
    val inverterRobot = InverterRobot()
    inverterRobot.say()
    inverterRobot.setModifier()
    inverterRobot.say()
}
