fun String.addExclamation(): String {
    return "$this!"
}
fun main() {
    val word = "Hello"
    println(word.addExclamation()) 
}
