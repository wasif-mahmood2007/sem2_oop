public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private static int count=0;

    //Default Constructor
    public Triangle()
    {
        sideA=1.0;
        sideB=1.0;
        sideC=1.0;
        count++;
    }

    //One-Parameter Constructor
    public Triangle(double x)
    {
        this.sideA=x;
        this.sideB=x;
        this.sideC=x;
        count++;
    }

    //Two-Parameter Constructor
    public Triangle(double x, double y)
    {
        this.sideA=x;
        this.sideB=x;
        this.sideC=y;
        count++;
    }

    //Three-Parameter Constructor
    public Triangle(double x, double y, double z)
    {
        this.sideA=x;
        this.sideB=y;
        this.sideC=z;
        count++;
    }

    //Copy Constructor
    public Triangle(Triangle copy)
    {
        this.sideA=copy.sideA;
        this.sideB=copy.sideB;
        this.sideC=copy.sideC;
        count++;
    }

    //Setters and Getters
    public void setSideA(double sideA)
    {
        this.sideA=sideA;
    }
    public double getSideA()
    {
        return sideA;
    }

    public void setSideB(double sideB)
    {
        this.sideB=sideB;
    }
    public double getSideB()
    {
        return sideB;
    }

    public void setSideC(double sideC)
    {
        this.sideC=sideC;
    }
    public double getSideC()
    {
        return sideC;
    }

    //Count Method
    public static int objectCount()
    {
        return count;
    }
    
    //Perimeter Calculator Method
    public double perimeter()
    {
        return sideA+sideB+sideC;
    }

    //Right Angle Checking Method
    public boolean isRightAngled()
    {
        return (sideA*sideA + sideB*sideB == sideC*sideC)|| (sideA*sideA + sideC*sideC == sideB*sideB)|| (sideB*sideB + sideC*sideC == sideA*sideA);
    }

    //Print Method
    @Override
    public String toString()
    {
        return "Triangle have sides "+sideA+", "+sideB+" and "+sideC+" with perimeter "+perimeter()+".";
    }
}
