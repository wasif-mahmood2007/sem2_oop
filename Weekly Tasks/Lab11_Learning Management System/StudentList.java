import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> students;

    //Constructor
    public StudentList()
    {
        students = new ArrayList<>();
    }

    //Add
    public void addStudent(Student studentObj)
    {
        students.add(studentObj);
    }

    //Remove
    public void removeStudent(String seatNo)
    {
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).getSeatNo().equals(seatNo))
            {
                students.remove(i);
                System.out.println("Removed " + seatNo);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    //Find
    public Student findStudent(String seatNo)
    {
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).getSeatNo().equals(seatNo))
            {
                System.out.println("Student found: " +students.get(i));
                return students.get(i);
            }
        }
        System.out.println("Student not found.");
        return null;
    }

    //Sort by Students Seat Numbers
    public void sortBySeatNo()
    {
        students.sort((s1, s2) -> s1.getSeatNo().compareToIgnoreCase(s2.getSeatNo()));
    }

    //Sort by Students Names (Bubble Sort)
    public void sortByName()
    {
        for(int i=0; i<students.size(); i++)
        {
            for(int j=i+1; j<students.size(); j++)
            {
                if(students.get(i).getName().compareToIgnoreCase(students.get(j).getName()) > 0)
                {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    //Display
    public void displayStudentList()
    {
        for(Student s: students)
        {
            System.out.println(s);
        }
    }

}
