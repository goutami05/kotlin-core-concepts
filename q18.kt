import kotlinx.coroutines.delay
suspend fun fetchWeather(): String {
    delay(1000) 
    return "Sunny" 
}
suspend fun main() {
    println("Fetching...")
    val weather = fetchWeather()
    println("Weather is: $weather")
}
