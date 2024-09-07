package lesson19

class Starship(
    private val starshipName: String,
) {
    fun launch() {
        // TODO Необходима информация для реализации необходимой логики
    }

    fun landing() {
        println("$starshipName  приземляется")
    }

    fun meteorDefence() {
        TODO("Реализовать логику защиты от метеоритов")
    }
}

fun main() {
    val starship = Starship("Авангард")
    starship.launch()
    starship.landing()
    starship.meteorDefence()
}
