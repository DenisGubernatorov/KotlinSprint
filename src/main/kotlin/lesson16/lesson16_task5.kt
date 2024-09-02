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

    fun getDamage(getDamage: Int): Int
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
    override fun getDamage(getDamage: Int): Int {
        println("$name  получает  $getDamage ед. урона")
        health -= getDamage.absoluteValue
        return health
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
    var healthVal: Int
    while (true) {
        healthVal = warrior.getDamage(40)
        if (warrior.checkIsDead(healthVal)) break
        warrior.heal()
        healthVal = warrior.getDamage(70)
        if (warrior.checkIsDead(healthVal)) break
        healthVal = warrior.getDamage(30)
        if (warrior.checkIsDead(healthVal)) break
    }
}
