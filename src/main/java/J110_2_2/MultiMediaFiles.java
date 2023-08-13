package J110_2_2;

public class MultiMediaFiles extends Media {

    public MultiMediaFiles (String name, int size, String format, String description, int minutes, int seconds) {
        super(name, size, format, description, minutes, seconds);
    }

    @Override
    public String getDetails() {
        return getFormat() + ", " + getDescription() + ", " + getDuration().getDurationInfo();
    }
}