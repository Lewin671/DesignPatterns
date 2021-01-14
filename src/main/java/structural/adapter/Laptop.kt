package structural.adapter

// country表示是哪个国家的笔记本
class Laptop(val country: String) {
    // 充电
    fun batteryCharge(socketAdapter: SocketAdapter) {
        socketAdapter.charge(this)
    }
}