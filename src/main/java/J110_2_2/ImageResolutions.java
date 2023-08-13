package J110_2_2;

public class ImageResolutions {

    private int height;
    private int width;


    // Конструктор разрешения картинки
    public ImageResolutions (int height, int width) {
        setWidth(width);
        setHeight(height);
    }

    // Геттер высоты картинки
    public int getHeight()
    {
        return height;
    }

    // Сеттер высоты картинки с проверкой
    public void setHeight(int height)
    {
        if (height <= 0) {
            throw new IllegalArgumentException("Height can not be null");
        }
        this.height = height;
    }

    // Геттер ширины картинки
    public int getWidth()
    {
        return width;
    }

    // Сеттер ширины картинки с проверкой
    public void setWidth(int width)
    {
        if (width <= 0) {
            throw new IllegalArgumentException("Width can not be null");
        }
        this.width = width;
    }

    public String  getResolutionInfo()
    {
        return  getHeight() + "x" + getWidth();
    }
}