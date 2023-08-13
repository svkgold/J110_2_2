package J110_2_2;

public class Images extends Files {

    private ImageResolutions ImageResolutions;

    public Images (String name, int size, String format, int height, int width)
    {
        super(name, size, format);
        this.ImageResolutions = new ImageResolutions (height, width);
    }

    public ImageResolutions getResolution()
    {
        return ImageResolutions;
    }

    public void setResolution(ImageResolutions resolution)
    {
        this.ImageResolutions = ImageResolutions;
    }

    @Override
    public String getDetails() {
        return getFormat() + ", " + getResolution().getResolutionInfo();
    }
}