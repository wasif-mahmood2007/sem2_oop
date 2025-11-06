public class Line
{
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private String color;
    private int thickness;

    //Default Constructor
    public Line()
    {
        startX=0;
        startY=0;
        endX=0;
        endY=0;
        color="Black";
        thickness=1;
    }

    //Parameterized Constructor
    public Line(int startX, int startY, int endX, int endY, String color, int thickness)
    {
        this.startX=startX;
        this.startY=startY;
        this.endX=endX;
        this.endY=endY;
        this.color=color;
        this.thickness=thickness;
    }

    //Copy Constructor
    public Line(Line other)
    {
        this.startX=other.startX;
        this.startY=other.startY;
        this.endX=other.endX;
        this.endY=other.endY;
        this.color=other.color;
        this.thickness=other.thickness;
    }

    //Setters and Getters
    public void setStartX(int startX)
    {
        this.startX=startX;
    }
    public int getStartX()
    {
        return startX;
    }

    public void setStartY(int startY)
    {
        this.startY=startY;
    }
    public int getStartY()
    {
        return startY;
    }

    public void setEndX(int endX)
    {
        this.endX=endX;
    }
    public int getEndX()
    {
        return endX;
    }

    public void setEndY(int endY)
    {
        this.endY=endY;
    }
    public int getEndY()
    {
        return endY;
    }

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

    //Length of the Line
    public double getLength()
    {
        int lengthX = endX-startX;
        int lengthY = endY-startY;
        return Math.sqrt((lengthX*lengthX)+(lengthY*lengthY));
    }

    //Print Method
    public String show()
    {
        return "Line starts from ("+startX+","+startY+") and ends on ("+endX+","+endY+"), have color "+color+" and thickness "+thickness+", with length "+String.format("%.2f", getLength())+".";
    }

}
