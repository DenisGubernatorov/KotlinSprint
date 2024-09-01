package lesson16

abstract class Character protected constructor(
    protected var name: String,
    protected var health: Int,
    protected var damage: Int,
    protected var healVal: Int,
) {
    protected abstract fun isDead(param: Int): Boolean
}

interface BaseCharacterActions {
    fun heal()

    fun getDamage(getDamage: Int): Boolean
}

class Warrior(
    name: String,
    health: Int,
    damage: Int,
    healVal: Int,
) : Character(name, health, damage, healVal),
    BaseCharacterActions {
    private var canHeal: Boolean = true

    override fun heal() {
        if (canHeal) {
            println("$name  восстанавливает $healVal ед. здоровья")
            health += healVal
        }
    }

    /**
     * Количество полученного дамага от другого персонажа
     */
    override fun getDamage(getDamage: Int): Boolean {
        println("$name  получает  $getDamage ед. урона")
        health -= getDamage
        return isDead(health)
    }

    override fun isDead(param: Int): Boolean =

        when {
            health <= 0 -> {
                canHeal = false
                damage = 0
                health = 0
                println("$name ++RIP++")
                true
            }

            else -> {
                false
            }
        }
}

fun main() {
    val warrior = Warrior("TaNGaR", 100, 60, 20)

    while (true) {
        if (warrior.getDamage(40)) break

        warrior.heal()

        if (warrior.getDamage(70)) break

        if (warrior.getDamage(30)) break
    }
}
