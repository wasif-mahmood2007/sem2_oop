public class Point2D {
    protected double xCord;
    protected double yCord;

    //Default Constructor
    public Point2D()
    {
        this.xCord=0.0;
        this.yCord=0.0;
    }

    //Parameterized Constructor
    public Point2D(double xCord, double yCord)
    {
        this.xCord=xCord;
        this.yCord=yCord;
    }

    //Setters
    public void setXCord(double xCord)
    {
        this.xCord=xCord;
    }

    public void setYCord(double yCord)
    {
        this.yCord=yCord;
    }

    //Getters
    public double getXCord()
    {
        return xCord;
    }

    public double getYCord()
    {
        return yCord;
    }

    //Representing 2D point
    @Override
    public String toString()
    {
        return "Two-Dimentional Point have X-Coordinate: " +xCord+ ", and Y-Coordinate: " +yCord+ ".";
    }
}
