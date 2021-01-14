package structural.facade

fun main() {
    val converter = VideoConversionFacade()
    val mp4Video = converter.convertVideo("youtube.ogg", "mp4")
}