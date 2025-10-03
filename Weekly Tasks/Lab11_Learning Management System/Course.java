public class Course implements Cloneable {
    private String courseName;
    private String code;

    //Default Constructor
    public Course()
    {
        this.courseName="Untitled";
        this.code="Unknown";
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

    //Setters
    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }
    
    public void setCode(String code)
    {
        this.code=code;
    }

    //Getters
    public String getCourseName()
    {
        return courseName;
    }

    public String getCode()
    {
        return code;
    }

    //Override clone() for Shallow Copy
    @Override
    public Course clone()
    {
        try
        {
            Course shallowCopy = (Course) super.clone();
            return shallowCopy;
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    //Override toString() to represent course
    @Override
    public String toString()
    {
        return "Course: "+courseName+", Code: "+code+".";
    }
}
