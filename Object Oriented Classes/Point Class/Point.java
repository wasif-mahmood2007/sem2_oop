public class Point
{
    private String color;
    private int thickness;
    private int xCord;
    private int yCord;

    //Default Constructor
    public Point()
    {
        color="Black";
        thickness=1;
        xCord=0;
        yCord=0;
    }

    //Parameterized Constructor
    public Point(String color, int thickness, int xCord, int yCord)
    {
        this.color=color;
        this.thickness=thickness;
        this.xCord=xCord;
        this.yCord=yCord;
    }

    //Setters and Getters Methods
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }

    public void setThickness(int thickness)
    {
        this.thickness=thickness;
    }
    public int getThickness()
    {
        return thickness;
    }

    public void setXCord(int xCord)
    {
        this.xCord=xCord;
    }
    public int getXCord()
    {
        return xCord;
    }

    public void setYCord(int yCord)
    {
        this.yCord=yCord;
    }
    public int getYCord()
    {
        return yCord;
    }

    //Print Method
    public String show()
    {
        return "Point is at ("+xCord+", "+yCord+"), with thickness "+thickness+" and color "+color+".";
    }
}