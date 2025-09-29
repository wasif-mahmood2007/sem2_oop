public class Point {
    protected double x;
    protected double y;

    //Default Constructor
    public Point()
    {
        this.x=0;
        this.y=0;
    }

    //Parameterized Constructor
    public Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    //Copy Constructor
    public Point(Point other)
    {
        this.x=other.x;
        this.y=other.y;
    }

    //Setters
    public void setX(double x)
    {
        this.x=x;
    }

    public void setY(double y)
    {
        this.y=y;
    }

    //Getters
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    //Represent Point
    @Override
    public String toString()
    {
        return "(" +x+ ", " +y+ ")";
    }
}
