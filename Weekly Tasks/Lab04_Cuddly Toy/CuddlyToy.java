public class CuddlyToy{
    private String toy;
    private String job;
    private String color;
    private int size;

    //Constructor
    public CuddlyToy(String toy, String job, String color, int size)
    {
        this.toy=toy;
        this.job=job;
        this.color=color;
        this.size=size;
    }

    //Getters
    public String getToy()
    {
        return toy;
    }

    public String getJob()
    {
        return job;
    }

    public String getColor()
    {
        return color;
    }

    public int getSize()
    {
        return size;
    }

    //Toy Noise Method
    public String toyNoise()
    {
        return "Unknown: *noise*";
    }

    //Print Method
    @Override
    public String toString()
    {
        return "TOY DESCRIPTION> Toy: "+toy+", Job: "+job+", Color: "+color+", Size: "+size+".";
    }
}