package lesson20

class PlayerWithKey(
    var haveKey: Boolean,
)

fun main() {
    val isHaveKey: (player: PlayerWithKey) -> Unit =
        { player -> println(if (player.haveKey) "Дверь открыта" else "Все еще закрыто") }
    isHaveKey(PlayerWithKey(true))

    isHaveKey(PlayerWithKey(false))
}
