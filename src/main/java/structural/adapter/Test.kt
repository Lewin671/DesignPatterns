package structural.adapter

fun main() {
    val adapter = SocketAdapter()
    val chineseLaptop = Laptop("Chinese")
    val usLaptop = Laptop("US")

    chineseLaptop.batteryCharge(adapter)
    usLaptop.batteryCharge(adapter)
}