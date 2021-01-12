package behavioral.observer

import java.io.File

class Editor {
    val eventManager: EventManager = EventManager("open", "save")
    private lateinit var file: File

    fun openFile(filePath: String) {
        this.file = File(filePath)
        eventManager.notify("open", file)
    }

    fun saveFile() {
        eventManager.notify("save", file)
    }
}
