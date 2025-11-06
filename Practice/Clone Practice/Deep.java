public class Deep implements Cloneable {
    String name;
    int seatNo;
    CGPA gpa;

    //Parameterized Constructor
    public Deep(String n, int s, double g)
    {
        this.name=n;
        this.seatNo=s;
        this.gpa=new CGPA(g);
    }

    //Setters and Getters
    public void setName(String n)
    {
        this.name=n;
    }
    public void setSeatNo(int s)
    {
        this.seatNo=s;
    }
    
    public String getName()
    {
        return name;
    }
    public int getSeatNo()
    {
        return seatNo;
    }

    //clone
    @Override
    public Deep clone()
    {
        try
        {
            Deep deepCopy = (Deep)super.clone(); //It deep copies the attributes. Shallow copy the objects/arrays.
            //So now we gonna deep copy object too.
            deepCopy.gpa = new CGPA(this.gpa.getCGPA());

            return deepCopy;
        }
        catch(CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    //toString
    @Override
    public String toString()
    {
        return "Name: "+name+", Seat No: "+seatNo+", "+gpa+"";
    }
}
