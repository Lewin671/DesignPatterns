package creational.abstractfactory

interface GuiFactory {
    fun createButton(): Button
    fun createCheckBox(): CheckBox
}