package some_complex_media_library;

public class BitrateReader {

    public static VideoFile reader(VideoFile file, Codec codec){

        System.out.println("BitrateReader: reading file...");
        return file;

    }

    public static VideoFile converter(VideoFile buffer, Codec codec){

        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
