package creational.abstractfactory

fun main() {
    val winFactory = WinFactory()
    val macFactory = MacFactory()

    winFactory.createButton().click()
    winFactory.createCheckBox().select()

    macFactory.createButton().click()
    macFactory.createCheckBox().select()
}