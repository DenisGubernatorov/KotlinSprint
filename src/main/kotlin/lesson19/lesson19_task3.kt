package lesson19

class Starship(
    private val starshipName: String,
) {
    fun launch() {
        // TODO Необходима информация для реализации необходимой логики
    }

    fun land() {
        println("$starshipName  приземляется")
    }

    fun defendFromMeteors() {
        TODO("Реализовать логику защиты от метеоритов")
    }
}

fun main() {
    val starship = Starship("Авангард")
    starship.launch()
    starship.land()
    starship.defendFromMeteors()
}
