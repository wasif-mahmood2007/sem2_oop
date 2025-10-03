import java.util.ArrayList;

public class CourseList implements Cloneable {
    private ArrayList<Course> courseList;

    //Default Constructor
    public CourseList()
    {
        courseList = new ArrayList<>();
    }

    //Parameterized Constructor
    public CourseList(Course... courses)
    {
        courseList = new ArrayList<>();
        for(Course c: courses)
        {
            courseList.add(c);
        }
    }

    //Get a Course
    public Course getCourse(int index)
    {
        if(index < 0 || index >= this.courseList.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            return this.courseList.get(index);
        }
    }

    //Set(Update) a Course
    public void setCourse(int index, Course c)
    {
        if(index < 0 || index >= this.courseList.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            this.courseList.set(index, c);
        }
    }

    //Add a Course
    public void addCourse(Course c)
    {
        this.courseList.add(c);
    }

    //Add Multiple Courses
    public void addMultipleCourses(Course... courses)
    {
        for(Course c: courses)
        {
            this.courseList.add(c);
        }
    }

    //Remove a Course using Index
    public void removeByIndex(int index)
    {
        if(index < 0 || index >= this.courseList.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            this.courseList.remove(index);
            System.out.println("Course removed successfully.");
        }
    }

    //Remove a Course using its Code
    public void removeByCode(String code)
    {
        for(int i=0; i<this.courseList.size(); i++)
        {
            if(code.equals(this.courseList.get(i).getCode()))
            {
                this.courseList.remove(i);
                System.out.println("Removed " +code+ " successfully.");
                return;
            }
        }
        System.out.println(code+ " not found.");
    }

    //Remove Multiple Courses
    public void removeMultipleCourses(int... indexes)
    {
        //Sorting indexes in descending order to avoid possible error.
        for(int i=0; i<indexes.length; i++)
        {
            for(int j=i+1; j<indexes.length; j++)
            {
                if(indexes[j] > indexes[i])
                {
                    int temp = indexes[i];
                    indexes[i] = indexes[j];
                    indexes[j] = temp;
                }
            }
        }

        for(int i: indexes)
        {
            if(i < 0 || i >= this.courseList.size())
            {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
            else
            {
                this.courseList.remove(i);
                System.out.println("Course at index " +i+ " removed successfully.");
            }
        }
    }

    //Find a Course
    public Course findCourse(String code)
    {
        for(int i=0; i<this.courseList.size(); i++)
        {
            if(code.equals(this.courseList.get(i).getCode()))
            {
                System.out.println("Course found: " +this.courseList.get(i));
                return this.courseList.get(i);
            }
        }
        System.out.println("Course " +code+ " not found.");
        return null;
    }

    //Sort Courses by Codes (Bubble Sort)
    public void sortByCode()
    {
        for(int i=0; i<this.courseList.size(); i++)
        {
            for(int j=i+1; j<this.courseList.size(); j++)
            {
                if(this.courseList.get(i).getCode().compareToIgnoreCase(this.courseList.get(j).getCode()) > 0)
                {
                    Course temp = courseList.get(i);
                    courseList.set(i, courseList.get(j));
                    courseList.set(j, temp);
                }
            }
        }
    }

    //Sort Courses by Code
    public void sortByCourseName()
    {
        this.courseList.sort((c1, c2) -> c1.getCourseName().compareToIgnoreCase(c2.getCourseName()));
    }

    //Override clone() for Deep copy
    @Override
    public CourseList clone()
    {
        try
        {
            CourseList deepCopy = (CourseList) super.clone();
            deepCopy.courseList = new ArrayList<>();

            for(Course c: this.courseList)
            {
                deepCopy.courseList.add(c.clone());
            }
            return deepCopy;
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    //Override toString() to represent course list
    @Override
    public String toString()
    {
        return courseList.toString();
    }
}
