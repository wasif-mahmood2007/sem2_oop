public class Course {
    private String courseName;
    private String code;

    //Default Constructor
    public Course()
    {
        this.courseName="Unknown";
        this.code="Untitled";
    }

    //Parameterized Constructor
    public Course(String courseName, String code)
    {
        this.courseName=courseName;
        this.code=code;
    }

    //Copy Constructor
    public Course(Course other)
    {
        this.courseName=other.courseName;
        this.code=other.code;
    }

    //Setters and Getters
    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }
    public String getCourseName()
    {
        return courseName;
    }

    public void setCode(String code)
    {
        this.code=code;
    }
    public String getCode()
    {
        return code;
    }

    //Print
    @Override
    public String toString()
    {
        return "Course: "+courseName+", Code: "+code+".";
    }
}