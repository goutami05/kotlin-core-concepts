import kotlinx.coroutines.*

fun main() = runBlocking { 
    val deferredResult = async {
        5 + 5
    }
    val result = deferredResult.await()
    println("Result: $result")
}
