import java.util.ArrayList;

public class StudentList implements Cloneable {
    private ArrayList<Student> studentList;

    //Default Constructor
    public StudentList()
    {
        this.studentList = new ArrayList<>();
    }

    //Parameterized Constructor
    public StudentList(Student... students)
    {
        this.studentList = new ArrayList<>();
        for(Student s: students)
        {
            this.studentList.add(s);
        }
    }

    //Get a Student
    public Student getStudent(int index)
    {
        if(index < 0 || index >= this.studentList.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            return this.studentList.get(index);
        }
    }

    //Set(Update) a Student
    public void setStudent(int index, Student s)
    {
        if(index < 0 || index >= this.studentList.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            this.studentList.set(index, s);
        }
    }

    //Add a Student
    public void addStudent(Student s)
    {
        this.studentList.add(s);
    }

    //Add Multiple Students
    public void addMultipleStudents(Student... students)
    {
        for(Student s: students)
        {
            this.studentList.add(s);
        }
    }

    //Remove a Student using Index
    public void removeByIndex(int index)
    {
        if(index < 0 || index >= this.studentList.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            this.studentList.remove(index);
            System.out.println("Student removed successfully.");
        }
    }

    //Remove a Student using their SeatNo
    public void removeBySeatNo(String seatNo)
    {
        for(int i=0; i<this.studentList.size(); i++)
        {
            if(seatNo.equals(this.studentList.get(i).getSeatNo()))
            {
                this.studentList.remove(i);
                System.out.println("Removed " +seatNo+ " successfully.");
                return;
            }
        }
        System.out.println(seatNo+ " not found.");
    }

    //Remove Multiple Students
    public void removeMultipleStudents(int... indexes)
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
            if(i < 0 || i >= this.studentList.size())
            {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
            else
            {
                this.studentList.remove(i);
                System.out.println("Student at index " +i+ " removed successfully.");
            }
        }
    }

    //Find a Student
    public Student findStudent(String seatNo)
    {
        for(int i=0; i<this.studentList.size(); i++)
        {
            if(seatNo.equals(this.studentList.get(i).getSeatNo()))
            {
                System.out.println("Student found: " +this.studentList.get(i));
                return this.studentList.get(i);
            }
        }
        System.out.println("Student " +seatNo+ " not found.");
        return null;
    }

    //Sort Students by Seat Numbers
    public void sortBySeatNo()
    {
        studentList.sort((s1, s2) -> s1.getSeatNo().compareToIgnoreCase(s2.getSeatNo()));
    }

    //Sort Students by Names (Bubble Sort)
    public void sortByName()
    {
        for(int i=0; i<this.studentList.size(); i++)
        {
            for(int j=i+1; j<this.studentList.size(); j++)
            {
                if(studentList.get(i).getName().compareToIgnoreCase(studentList.get(j).getName()) > 0)
                {
                    Student temp = studentList.get(i);
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, temp);
                }
            }
        }
    }

    //Override clone() for Deep copy
    @Override
    public StudentList clone()
    {
        try
        {
            StudentList deepCopy = (StudentList) super.clone();
            deepCopy.studentList = new ArrayList<>();

            for(Student s: this.studentList)
            {
                deepCopy.studentList.add(s.clone());
            }  
            return deepCopy;
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }

    //Override toString() to represent student list
    @Override
    public String toString()
    {
        return studentList.toString();
    }
}
