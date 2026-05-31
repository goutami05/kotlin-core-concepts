sealed class ScreenState 
object Loading : ScreenState() 
data class Success(val data: String) : ScreenState() 
fun main() {
    val state1: ScreenState = Loading
    val state2: ScreenState = Success("Homepage Loaded")
    println("States created successfully: $state1, $state2")
}
