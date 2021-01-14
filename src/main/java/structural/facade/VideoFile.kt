package structural.facade

class VideoFile(val fileName: String) {
    val codecType: String = fileName.substring(fileName.indexOf('.') + 1);
}