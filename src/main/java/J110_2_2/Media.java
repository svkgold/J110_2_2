package J110_2_2;

public abstract class Media extends Files {

    private Durations durations;

    private String description;

    public Media (String name, int size, String format, String description, int hour, int minutes, int seconds){
        super(name,size,format);
        setDescription(description);
        this.durations = new Durations (hour, minutes, seconds);
    }

    public Media (String name, int size, String format, String description, int minutes, int seconds){
        super(name,size,format);
        setDescription(description);
        this.durations = new Durations (minutes, seconds);
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Durations getDuration()
    {
        return durations;
    }

    public void setDuration(Durations durations)
    {
        this.durations = durations;
    }
}