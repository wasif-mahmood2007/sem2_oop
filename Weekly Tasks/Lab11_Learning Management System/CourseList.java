import java.util.ArrayList;

public class CourseList {
    private ArrayList<Course> courses;

    //Constructor
    public CourseList()
    {
        courses = new ArrayList<>();
    }

    //Add
    public void addCourse(Course courseName)
    {
        courses.add(courseName);
    }

    //Remove
    public void removeCourse(String code)
    {
        for(int i=0; i<courses.size(); i++)
        {
            if(courses.get(i).getCode().equals(code))
            {
                courses.remove(i);
                System.out.println("Removed " + code);
                return;
            }
        }
        System.out.println("Course not found.");
    }

    //Find
    public Course findCourse(String code)
    {
        for(int i=0; i<courses.size(); i++)
        {
            if(courses.get(i).getCode().equals(code))
            {
                System.out.println("Course found: " +courses.get(i));
                return courses.get(i);
            }
        }
        System.out.println("Course not found.");
        return null;
    }

    //Sort by Course Code (Bubble Sort)
    public void sortByCode()
    {
        for(int i=0; i<courses.size(); i++)
        {
            for(int j=i+1; j<courses.size(); j++)
            {
                if(courses.get(i).getCode().compareToIgnoreCase(courses.get(j).getCode()) > 0)
                {
                    Course temp = courses.get(i);
                    courses.set(i, courses.get(j));
                    courses.set(j, temp);
                }
            }
        }
    }

    //Sort by Course Name
    public void sortByName()
    {
        courses.sort((c1, c2) -> c1.getCourseName().compareToIgnoreCase(c2.getCourseName()));
    }

    //Display
    public void displayCourseList()
    {
        for(Course c: courses)
        {
            System.out.println(c);
        }
    }
}