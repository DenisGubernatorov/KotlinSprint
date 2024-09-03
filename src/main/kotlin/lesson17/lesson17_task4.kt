package lesson17

class Package(
    pacLocation: String,
) {
    val pacNumber = this.hashCode()
    var pacLocation = pacLocation
        set(value) {
            field = value
            movementCounter++
        }
    var movementCounter = 0
}

fun main() {
    val package1 = Package("Moscow")
    println(package1.pacLocation)
    println(package1.movementCounter)

    package1.pacLocation = "Saint-Petersburg"
    println(package1.pacLocation)
    println(package1.movementCounter)
}
