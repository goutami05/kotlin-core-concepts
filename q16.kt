class Window {
    var width = 0
    var height = 0
}

fun main() {
    val mainWindow = Window().apply {
        width = 1920
        height = 1080
    }
    println("Window dimensions: ${mainWindow.width}x${mainWindow.height}")
}
