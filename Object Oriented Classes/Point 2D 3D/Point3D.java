public class Point3D extends Point2D {
    private double zCord;

    //Default Constructor
    public Point3D()
    {
        super();
        this.zCord=0.0;
    }

    //Parameterized Constructor (only Z Coordinate)
    public Point3D(double zCord)
    {
        super();
        this.zCord=zCord;
    }

    //Parameterized Constructor (X, Y, Z Coordinates)
    public Point3D(double xCord, double yCord, double zCord)
    {
        super(xCord, yCord);
        this.zCord=zCord;
    }

    //Copy Constructor
    public Point3D(Point3D other)
    {
        super(other.xCord, other.yCord);
        this.zCord=other.zCord;
    }

    //Setter
    public void setZCord(double zCord)
    {
        this.zCord=zCord;
    }

    //Getter
    public double getZCord()
    {
        return zCord;
    }

    //Representing 3D point
    @Override
    public String toString()
    {
        return "Three-Dimentional Point have X-Coordinate: " +xCord+ ", and Y-Coordinate: " +yCord+ ", and Z-Coordinate: " +zCord+ ".";
    }
}

