package some_complex_media_library;

public class VideoFile {
    public String name;
    public String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") +1);
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
