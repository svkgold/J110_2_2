package J110_2_2;

public class Documents extends Files{

    private int pages;

    public Documents (String name, int size, String format, int pages) {
        super (name, size, format);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {

        if (pages <= 0) {
            throw new IllegalArgumentException("Page can not be 0 or less");
        }
        this.pages = pages;
    }

    @Override
    public String getDetails()
    {
        return getFormat() + ", " + getPages() + " pages";
    }
}