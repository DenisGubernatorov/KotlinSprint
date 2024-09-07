package lesson18

abstract class TamagochiAnimal(
    open val name: String,
) {
    abstract fun eat()

    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(
    name: String,
) : TamagochiAnimal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(
    name: String,
) : TamagochiAnimal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(
    name: String,
) : TamagochiAnimal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val animals: MutableList<TamagochiAnimal> = mutableListOf(Fox("Foxy"), Dog("Jack"), Cat("Beast"))
    animals.forEach {
        it.eat()
        it.sleep()
    }
}
