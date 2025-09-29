public class Pen extends Point {
    //Points from Point class, Strings to hava shape thickness and color 
    protected String inkColor;
    protected double tipThickness;

    //Default Constructor
    public Pen()
    {
        this.inkColor="Black";
        this.tipThickness=1.0;
    }

    //Parameterized Constructor
    public Pen(String inkColor, double tipThickness)
    {
        this.inkColor=inkColor;

        if(tipThickness > 0)
        {
            this.tipThickness=tipThickness;
        }
        else
        {
            System.out.println("Tip Thickness must be greater than 0. Setting 1.0 as default.");
            this.tipThickness=1.0;
        }
    }

    //Copy Constructor
    public Pen(Pen other)
    {
        this.inkColor=other.inkColor;
        this.tipThickness=other.tipThickness;
    }

    //Setters
    public void setInkColor(String inkColor)
    {
        this.inkColor=inkColor;
    }

    public void setTipThickness(double tipThickness)
    {
        this.tipThickness=tipThickness;
    }

    //Getters
    public String getInkColor()
    {
        return inkColor;
    }

    public double getTipThickness()
    {
        return tipThickness;
    }

    //Line using 2 points
    public String drawLine(Point p1, Point p2)
    {  
        return "Line starts at " +p1+ ", and ends at " +p2+ ", colored " +inkColor+ " and " +tipThickness+ " thickness.";
    }

    //Triangle using 3 points
    public String drawTriangle(Point p1, Point p2, Point p3)
    {
        return inkColor+ " triangle drawn with points " +p1+ ", " +p2+ " and " +p3+ ", of thickness " +tipThickness+ ".";
    }

    //Quadrilateral using 4 points
    public String drawQuadrilateral(Point p1, Point p2, Point p3, Point p4)
    {
        return inkColor+ " quadrilateral drawn with points " +p1+ ", " +p2+ ", " +p3+ " and " +p4+ ", of thickness " +tipThickness+ ".";
    }

    //Shape using n points
    public String drawShape(Point... points)
    {
        String result = "Drew a " +inkColor+ " shape having points: ";
        for(int i=0; i<points.length; i++)
        {
            result = result + points[i];
            if(i<points.length-1)
            {
                result = result + ", ";
            }
        }
        result = result + ", of thickness " +tipThickness+ ".";
        return result;
    }

    //Represent Pen details
    @Override
    public String toString()
    {
        return "The pen's ink is " +inkColor+ " colored, with tip size of " +tipThickness+ ".";
    }
}
