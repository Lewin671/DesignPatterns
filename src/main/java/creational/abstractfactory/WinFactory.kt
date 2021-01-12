package creational.abstractfactory

class WinFactory : GuiFactory {
    override fun createButton(): Button {
        return WinButton()
    }

    override fun createCheckBox(): CheckBox {
        return WinCheckBox()
    }
}