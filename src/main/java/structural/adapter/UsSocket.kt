package structural.adapter

class UsSocket {
    fun chargeUsLaptop(laptop: Laptop) {
        println("${laptop.toString()} charge with US socket")
    }
}