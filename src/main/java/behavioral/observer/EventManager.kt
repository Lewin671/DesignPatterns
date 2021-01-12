package behavioral.observer

import java.io.File


class EventManager(vararg operations: String) {
    private val listeners = HashMap<String, MutableList<EventListener>>()

    init {
        for (operation in operations) {
            listeners[operation] = ArrayList<EventListener>()
        }
    }

    fun subscribe(eventType: String, listener: EventListener) {
        val users = listeners[eventType]
        users?.add(listener)
    }

    fun unsubscribe(eventType: String, listener: EventListener) {
        val users = listeners[eventType]
        users?.remove(listener)
    }

    fun notify(eventType: String, file: File) {
        val users = listeners[eventType]
        users?.let {
            for (user in it) {
                user.update(eventType, file)
            }
        }
    }
}
