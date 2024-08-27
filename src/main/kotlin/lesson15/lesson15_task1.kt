package lesson15

interface Fly {
    fun doFly() {
        println("летит")
    }
}

interface Swim {
    fun doSwim() {
        println("плывет")
    }
}

class Carp : Swim {
    val className = "Карп"
}

class Seagull : Fly {
    val className = "Чайка"
}

class Duck :
    Swim,
    Fly {
    val className = "Утка"
}

fun main() {
    val carp = Carp()
    print("${carp.className} ")
    carp.doSwim()

    val seagull = Seagull()

    print("${seagull.className} ")
    seagull.doFly()

    val duck = Duck()
    print("${duck.className} ")
    duck.doSwim()
    print("${duck.className} ")
    duck.doFly()
}
