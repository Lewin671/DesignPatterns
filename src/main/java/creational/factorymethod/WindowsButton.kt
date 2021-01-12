package creational.factorymethod

class WindowsButton : Button {
    override fun render() {
        println("Windows button is rendered")
    }

    override fun onClick() {
        println("Windows button is clicked")
    }
}