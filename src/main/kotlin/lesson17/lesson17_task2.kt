package lesson17

class Ship(
    name: String,
    averageSpeed: Int,
    homePort: String,
) {
    var name = name
        get() = field
        set(value) {
            println("Имя корабля изменить нельзя")
        }
    var averageSpeed: Int = averageSpeed
        get() = field
        set(value) {
            field = value
        }
    var homePort = homePort
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val ship = Ship("Крузенштерн", 15, "Простоквашино")
    println(ship.name)
    println(ship.averageSpeed)
    println(ship.homePort)
    ship.name = "Печкин"
}
