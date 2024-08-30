package lesson15

abstract class Vehicle : VehicleMove {
    abstract val passengersMaxCount: Int
    abstract val cargoMaxLoad: Double
}

interface VehicleMove {
    fun move(): String
}

interface CargoTransportation {
    fun loadTruck(cargoAmount: Double): Double

    fun unloadTruck(): String
}

interface PassengerTransportation {
    fun passengerOnboarding(passengerCount: Int): Int

    fun passengersOffBoarding()
}

class Truck :
    Vehicle(),
    CargoTransportation,
    PassengerTransportation {
    override val passengersMaxCount = 1
    override val cargoMaxLoad = 2.0
    private val truckId = hashCode()
    private var loadedTons = 0.0
    var hasPassenger = false

    override fun move(): String = "Грузовик $truckId едет соблюдая скоростной режим и знаки для грузовиков"

    override fun loadTruck(cargoAmount: Double): Double {
        val loaded =
            if (cargoAmount >= cargoMaxLoad) cargoMaxLoad else cargoAmount
        loadedTons = loaded

        println("Грузовик $truckId загружает $loadedTons тонны")
        return cargoAmount - loaded
    }

    override fun unloadTruck(): String = "Грузовик $truckId разгружает $loadedTons тонны"

    override fun passengerOnboarding(passengerCount: Int): Int {
        println("Грузовик $truckId сажает одного пассажира")
        hasPassenger = true
        return passengerCount - passengersMaxCount
    }

    override fun passengersOffBoarding() {
        println("Грузовик $truckId высаживает одного пассажира")
    }
}

class Car :
    Vehicle(),
    PassengerTransportation {
    override val passengersMaxCount = 3
    override val cargoMaxLoad = 0.0
    private val carId = this.hashCode()
    private var passengerOnBoard = 0

    override fun move(): String = "Легковая машина $carId едет соблюдая скоростной режим и знаки для легковых"

    override fun passengerOnboarding(passengerCount: Int): Int {
        passengerOnBoard =
            if (passengerCount >= passengersMaxCount) passengersMaxCount else passengerCount

        println("Легковая машина  $carId сажает $passengerOnBoard пассажиров")
        return passengerCount - passengerOnBoard
    }

    override fun passengersOffBoarding() {
        println("Легковая машина $carId высаживает $passengerOnBoard пассажиров")
    }
}

fun main() {
    val vehicleCount = mutableListOf<Vehicle>()
    print("Введите количество груза (тонн): ")
    var cargoAmount = getCargoAmountOrPassNumber().toDouble()
    print("Введите количество пассажиров (чел.): ")
    var passengerCount = getCargoAmountOrPassNumber().toInt()
    while (cargoAmount > 0) {
        val candidate = Truck()
        cargoAmount = candidate.loadTruck(cargoAmount)
        vehicleCount.add(candidate)
    }

    while (passengerCount > 0) {
        val candidate = Car()
        val truckWithoutPassenger = vehicleCount.filterIsInstance<Truck>().filter { !it.hasPassenger }

        when {
            passengerCount < candidate.passengersMaxCount && passengerCount <= truckWithoutPassenger.size -> {
                passengerCount =
                    truckWithoutPassenger.fold(passengerCount) { currentCount, truck ->
                        if (currentCount > 0) truck.passengerOnboarding(currentCount) else currentCount
                    }
            }

            else -> {
                passengerCount = candidate.passengerOnboarding(passengerCount)
                vehicleCount.add(candidate)
            }
        }
    }
    println()
    if (vehicleCount.isNotEmpty()) {
        vehicleCount.forEach { println(it.move()) }

        Thread.sleep(10000)
        vehicleCount.filterIsInstance<Car>().forEach { it.passengersOffBoarding() }
        Thread.sleep(5000)
        vehicleCount.filterIsInstance<Truck>().forEach {
            println(it.unloadTruck())
            if (it.hasPassenger) it.passengersOffBoarding()
        }
    }
}

fun getCargoAmountOrPassNumber(): Number =
    try {
        readln().toDouble()
    } catch (e: NumberFormatException) {
        println("Введено не число. попробуйте еще раз")
        getCargoAmountOrPassNumber()
    }
