package lesson14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val canLanding: Boolean,
) {
    open fun showInfo() {
        println(
            """
            Type: ${this.javaClass.simpleName}
            Name: $name
            Has Atmosphere: $hasAtmosphere
            Can landing: $canLanding
            """.trimIndent(),
        )
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    canLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, canLanding) {
    private val satellites = mutableListOf<CelestialBody>()

    fun addSatellite(satellite: CelestialBody) {
        satellites.add(satellite)
    }

    fun removeSatellite(satellite: CelestialBody) {
        satellites.remove(satellite)
    }

    override fun showInfo() {
        super.showInfo()
        println(
            "Satellites: ${
                if (satellites.isNotEmpty()) {
                    satellites.joinToString("\n" + " ".repeat("Satellites: ".length)) { it.name }
                } else {
                    "No satellites"
                }
            }",
        )
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    canLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, canLanding)

fun main() {
    val planet1 = Planet("planet1", hasAtmosphere = true, canLanding = true)
    planet1.addSatellite(Satellite("P1.S1", hasAtmosphere = false, canLanding = false))
    planet1.addSatellite(Satellite("P1.S2", hasAtmosphere = true, canLanding = true))
    planet1.showInfo()
}
