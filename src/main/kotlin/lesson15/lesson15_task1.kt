package lesson15

interface Fly {
    val name: String

    fun doFly() {
        println("${this.name} летит")
    }
}

interface Swim {
    val name: String

    fun doSwim() {
        println("${this.name} плывет")
    }
}

class Carp(
    override val name: String,
) : Swim

class Seagull(
    override val name: String,
) : Fly

class Duck(
    override val name: String,
) : Swim,
    Fly

fun main() {
    val carp = Carp("Карп")
    carp.doSwim()

    val seagull = Seagull("Чайка")
    seagull.doFly()

    val duck = Duck("Утка")
    duck.doFly()
    duck.doSwim()
}
