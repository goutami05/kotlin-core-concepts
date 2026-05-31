data class User(val id: Int, val username: String, val isActive: Boolean) 
fun main() {
    val originalUser = User(1, "KotlinDev", true)
    val copiedUser = originalUser.copy(isActive = false)
    println("Original: $originalUser")
    println("Copied:   $copiedUser")
}
