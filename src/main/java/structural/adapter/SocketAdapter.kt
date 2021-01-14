package structural.adapter

class SocketAdapter : Socket {
    override fun charge(laptop: Laptop) {
        when (laptop.country) {
            "Chinese" -> ChineseSocket().chargeChineseLaptop(laptop)
            "US" -> UsSocket().chargeUsLaptop(laptop)
            else -> println("Unsupported laptop")
        }
    }
}