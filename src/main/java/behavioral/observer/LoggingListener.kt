package behavioral.observer

import java.io.File

class LoggingListener(fileName: String) : EventListener {
    private val log = File(fileName)


    override fun update(eventType: String, file: File) {
        println(
            "Save to log  $log: Someone has performed $eventType operation " +
                    "with the following file: ${file.name}"
        )
    }
}
