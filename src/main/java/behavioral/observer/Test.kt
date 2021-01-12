package behavioral.observer

fun main() {
    val editor = Editor()

    editor.eventManager.subscribe("open", LoggingListener("/Users/qingyingliu/file.txt"))
    editor.eventManager.subscribe("save", EmailAlertListener("admin@example.com"))
    editor.eventManager.subscribe("save", EmailAlertListener("qingyingliu@example.com"))
    try {
        editor.openFile("test.txt")
        editor.saveFile()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}


