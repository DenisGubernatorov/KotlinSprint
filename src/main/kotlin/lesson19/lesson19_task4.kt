package lesson19

enum class Ammunition(
    private val damage: Int,
) {
    BLUE(5),
    GREEN(10),
    RED(20),
    ;

    fun getDamage(): Int = this.damage
}

class Tank(
    private var ammunitionType: Ammunition? = null,
) {
    fun loadAmmo(ammunition: Ammunition) {
        ammunitionType = ammunition
    }

    fun shoot() =
        println(
            ammunitionType?.let {
                "Танк стреляет снарядом с уроном ${it.getDamage()}"
            } ?: "Осечка",
        )
}

fun main() {
    val tank = Tank()
    Ammunition.entries.forEach {
        tank.loadAmmo(it)
        tank.shoot()
    }
    val tank1 = Tank()
    tank1.shoot()
}
