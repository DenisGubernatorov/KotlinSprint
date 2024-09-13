package lesson21

class Player21(
    var name: String,
    var currentHealth: Int,
) {
    val maxHealth: Int = 100
}

fun Player21.isHealthy(): Boolean = currentHealth == maxHealth

fun main() {
    val player21 = Player21("Tan", 50)
    println(player21.isHealthy())
    player21.currentHealth = player21.maxHealth
    println(player21.isHealthy())
}
