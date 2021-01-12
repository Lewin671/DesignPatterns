package creational.factorymethod

class WindowsDialog:Dialog {
    override fun createButton(): Button {
        return WindowsButton()
    }
}