package structural.facade

import java.io.File

// 外观提供了进行视频转换的简单接口
class VideoConversionFacade {
    fun convertVideo(fileName: String, destinationFormat: String): File {
        println("VideoConversionFacade: conversion started.")
        val file = VideoFile(fileName)
        val sourceCodec = CodecFactory.extract(file)
        val destinationCodec = when (destinationFormat) {
            "mp4" -> MPEG4CompressionCodec()
            else -> OggCompressionCodec()
        }

        val buffer = BitrateReader.read(file, sourceCodec)
        val intermediateResult = BitrateReader.convert(buffer, destinationCodec)
        val result = AudioMixer().fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result
    }
}