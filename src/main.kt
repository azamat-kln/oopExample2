fun main() {

    val toyotoA50 = Toyoto("white", "Toyoto", 9_000_000)

    val bugattiVeiron = Bugatti("blue-black", "Volkswagen", 90_000_000, false)

    val driverToyoto = Driver(toyotoA50)
    driverToyoto.driveCar()

    val driverBugatti = Driver(bugattiVeiron)
    driverBugatti.driveCar()
}