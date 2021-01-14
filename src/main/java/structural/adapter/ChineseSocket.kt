package structural.adapter


class ChineseSocket {
    fun chargeChineseLaptop(laptop: Laptop) {
        println("${laptop.toString()} charge with Chinese Socket")
    }
}