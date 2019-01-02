package facade;

import some_complex_media_library.*;

import java.io.File;

public class VideoConversionFacade {

    public File converteVideo(String fileName, String format){

        System.out.println("VideoConversionFacade conversion started");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);

        Codec distinationCodec;
        if(format.equals("mp4")){
            distinationCodec = new OggCompressionCodec();
        } else {
            distinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.reader(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.converter(buffer, distinationCodec);

        File result = (new AudioMixer().fix(intermediateResult));

        System.out.println("VideoConversionFacade: conversion completed.");

        return result;
    }
}
