package creational.factorymethod

class HtmlButton:Button {
    override fun render() {
        println("HTML button is rendered")
    }

    override fun onClick() {
        println("HTML button is clicked")
    }
}