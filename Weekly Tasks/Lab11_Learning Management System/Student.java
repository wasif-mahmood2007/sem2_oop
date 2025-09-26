public class Student {
    private String name;
    private String seatNo;

    //Default Constructor
    public Student()
    {
        name="Unknown";
        seatNo="0";
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

    //Setters and Getters
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public void setSeatNo(String seatNo)
    {
        this.seatNo=seatNo;
    }
    public String getSeatNo()
    {
        return seatNo;
    }

    //Print
    @Override
    public String toString()
    {
        return "Student: "+name+", Seat No: "+seatNo+".";
    }
}