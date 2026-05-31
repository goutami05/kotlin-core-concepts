class Thermostat {
    var temperature: Double = 22.0
        private set
    fun updateTemperature(newTemp: Double) {
        temperature = newTemp
    }
}
fun main() {
    val thermostat = Thermostat()
    println("Initial temperature: ${thermostat.temperature}°C")
    
    thermostat.updateTemperature(24.5)
    println("Updated temperature: ${thermostat.temperature}°C")
}
