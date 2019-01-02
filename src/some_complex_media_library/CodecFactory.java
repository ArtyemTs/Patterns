package some_complex_media_library;

public class CodecFactory {

    public static Codec extract (VideoFile file){

        String type = file.getCodecType();

        if(type.equals("mp4")){
            System.out.println("CodeFactory: extractinf mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodeFactory: extractinf ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
