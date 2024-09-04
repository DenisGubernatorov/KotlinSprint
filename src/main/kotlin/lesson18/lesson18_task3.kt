package lesson18

open class TamagochiAnimal(
    open val name: String,
) {
    open fun eat() {}
}

class Fox(
    override val name: String,
) : TamagochiAnimal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(
    override val name: String,
) : TamagochiAnimal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(
    override val name: String,
) : TamagochiAnimal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val animals: MutableList<TamagochiAnimal> = mutableListOf(Fox("Foxy"), Dog("Jack"), Cat("Beast"))
    animals.forEach { it.eat() }
}
