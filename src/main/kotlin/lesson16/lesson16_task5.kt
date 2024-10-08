package lesson16

import kotlin.math.absoluteValue

abstract class Character protected constructor(
    protected var name: String,
    protected var health: Int,
    protected var damage: Int,
    protected var healVal: Int,
    protected var canHeal: Boolean,
) {
    open fun checkIsDead(param: Int): Boolean = isDead(param)

    private fun isDead(param: Int): Boolean = param <= 0
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
) : Character(name, health, damage, healVal, true),
    BaseCharacterActions {
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
        health -= getDamage.absoluteValue

        return checkIsDead(health)
    }

    override fun checkIsDead(param: Int): Boolean {
        return when {
            super.checkIsDead(param) -> {
                canHeal = false
                damage = 0
                health = 0
                println("$name ++RIP++")
                return true
            }

            else -> false
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
