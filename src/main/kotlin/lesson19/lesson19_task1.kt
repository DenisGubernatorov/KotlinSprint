package lesson19

enum class Fishes(
    val description: String,
) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println(
        "Можно добавить:\n${
            Fishes.entries.joinToString(",\n", transform = Fishes::description)
        }",
    )
}
