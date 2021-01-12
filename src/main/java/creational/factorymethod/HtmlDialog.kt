package creational.factorymethod

class HtmlDialog:Dialog {
    override fun createButton(): Button {
        return HtmlButton()
    }
}