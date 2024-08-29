package lesson15

interface Fly {
    fun doFly()
}

interface Swim {
    fun doSwim()
}

class Carp : Swim {
    override fun doSwim() {
        println("Карп плывет")
    }
}

class Seagull : Fly {
    override fun doFly() {
        println("Чайка летит")
    }
}

class Duck :
    Swim,
    Fly {
    override fun doSwim() {
        println("Утка плывет")
    }

    override fun doFly() {
        println("Утка летит")
    }
}

fun main() {
    val carp = Carp()
    carp.doSwim()

    val seagull = Seagull()
    seagull.doFly()

    val duck = Duck()
    duck.doSwim()
    duck.doFly()
}
