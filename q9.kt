class IDGenerator {
    // Encapsulated state and logic tied directly to the class name 
    companion object {
        var currentId = 0
            private set 

        fun getNextId(): Int {
            currentId++
            return currentId
        }
    }
}

fun main() {
    println("ID: ${IDGenerator.getNextId()}") // 1
    println("ID: ${IDGenerator.getNextId()}") // 2
}
