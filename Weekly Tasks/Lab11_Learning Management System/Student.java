public class Student implements Cloneable{
    private String name;
    private String seatNo;

    //Default Constructor
    public Student()
    {
        this.name="Unknown";
        this.seatNo="0";
    }

    //Parameterized Constructor
    public Student(String name, String seatNo)
    {
        this.name=name;
        this.seatNo=seatNo;
    }

    //Copy Constructor
    public Student(Student other)
    {
        this.name=other.name;
        this.seatNo=other.seatNo;
    }

    //Setters
    public void setName(String name)
    {
        this.name=name;
    }

    public void setSeatNo(String seatNo)
    {
        this.seatNo=seatNo;
    }

    //Getters
    public String getName()
    {
        return name;
    }

    public String getSeatNo()
    {
        return seatNo;
    }

    //Override clone() for Shallow Copy
    @Override
    public Student clone()
    {
        try
        {
            Student shallowCopy = (Student) super.clone();
            return shallowCopy;
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    //Override toString() to represent student
    @Override
    public String toString()
    {
        return "Student: "+name+", Seat No: "+seatNo+".";
    }
}
