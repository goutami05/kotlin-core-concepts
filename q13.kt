fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    
    // One-liner filter for even entries 
    val evenNumbers = numbers.filter { it % 2 == 0 }
    
    println(evenNumbers) 
}
