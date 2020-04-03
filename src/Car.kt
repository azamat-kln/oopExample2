abstract class Car : CarBehaviour {
    abstract val color: String
    abstract val manufacturer: String
    abstract val price: Int
}

abstract class NormalCar : Car() {
    val seatCount = 4
}

abstract class SportCar : Car(), SportCarBehavior {
    abstract val hasTurbo: Boolean
    val seatCount = 2
}

class Toyoto(override val color: String, override val manufacturer: String, override val price: Int) : NormalCar() {

    override fun startEngine() {

    }

    override fun drive() {
        println("$color $manufacturer drives")
    }

    override fun stopEngine() {

    }

}

class Bugatti(
    override val color: String,
    override val manufacturer: String,
    override val price: Int,
    override val hasTurbo: Boolean
) : SportCar() {

    override fun startEngine() {

    }

    override fun drive() {
        println("$color $manufacturer drives")
    }

    override fun driveFast() {

    }

    override fun stopEngine() {

    }

}

class Driver(private val car: CarBehaviour) : DriverBehaviour {

    override fun driveCar() {
        car.drive()
    }

}

interface DriverBehaviour {
    fun driveCar()
}


interface SportCarBehavior {
    fun driveFast()
}

interface CarBehaviour {
    fun startEngine()
    fun drive()
    fun stopEngine()
}