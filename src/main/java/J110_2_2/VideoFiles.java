package J110_2_2;

    public class VideoFiles extends Media {

        private ImageResolutions ImageResolutions;

        public VideoFiles (String name, int size, String format, String description,
                         int hour, int minutes, int seconds,int height, int width) {
            super(name, size, format, description, hour, minutes, seconds);
            this.ImageResolutions = new ImageResolutions (height, width);
        }

        public ImageResolutions getResolution()
        {
            return ImageResolutions;
        }

        public void setResolution(ImageResolutions resolution)
        {
            this.ImageResolutions = resolution;
        }

        @Override
        public String getDetails() {
            return getFormat() + ", " + getDescription() + ", " + getDuration().getDurationInfo() + ", " + getResolution().getResolutionInfo();
        }
    }