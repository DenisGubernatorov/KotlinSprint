package lesson19

enum class Ammunition(
    private val damage: Int,
) {
    BLUE(5),
    GREEN(10),
    RED(20),
    ;

    fun getDamage(ammunition: Ammunition): Int = ammunition.damage
}

class Tank {
    private var damage = 0

    fun loadAmmo(ammunition: Ammunition) {
        damage = ammunition.getDamage(ammunition)
    }

    fun shoot() {
        println("Танк стреляет снарядом с уроном $damage")
    }
}

fun main() {
    val tank = Tank()
    Ammunition.entries.forEach {
        tank.loadAmmo(it)
        tank.shoot()
    }
}
