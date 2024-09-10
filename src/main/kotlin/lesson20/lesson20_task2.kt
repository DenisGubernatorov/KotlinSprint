package lesson20

class Player20(
    var name: String,
    var currentHealth: Int,
) {
    val maxHealth: Int = 100
}

fun main() {
    val healFun: (player: Player20) -> Unit = { player -> player.currentHealth = player.maxHealth }
    val player20 = Player20("Tan", 30)
    println(player20.currentHealth)
    healFun(player20)
    println(player20.currentHealth)
}
