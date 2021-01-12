package creational.factorymethod

fun main() {
    // 创建工厂
    val windowsDialog = WindowsDialog()
    val htmlDialog = HtmlDialog()

    windowsDialog.createButton().onClick()
    windowsDialog.createButton().render()

    htmlDialog.createButton().onClick()
    htmlDialog.createButton().render()
}