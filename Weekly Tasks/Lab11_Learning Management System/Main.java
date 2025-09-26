public class Main {
    public static void main(String[] args)
    {
        //Create Course List
        CourseList cl = new CourseList();

        cl.addCourse(new Course("Discrete Structures", "CS-358"));
        cl.addCourse(new Course("Digital Logic Design", "CS-354"));
        cl.addCourse(new Course("Object Oriented Programming", "CS-352"));
        cl.addCourse(new Course("Linear Algebra", "CS-356"));
        cl.addCourse(new Course("Ideology & Constitution of Pakistan", "CS-362"));
        cl.addCourse(new Course("Communication & Presentation Skills", "CS-360"));

        cl.displayCourseList(); //Displaying created Courses List

        cl.sortByName(); //Sorting the list by courses names
        System.out.println("Name Sorted:");
        cl.displayCourseList();

        cl.sortByCode(); //Sorting the list by courses codes
        System.out.println("Code Sorted:");
        cl.displayCourseList();

        cl.findCourse("CS-352"); //Searching a course from the created list
        cl.findCourse("👅"); //When required course is not in the list

        cl.removeCourse("CS-360"); //Removing a course from the list
        cl.displayCourseList();


        //Create Student List
        StudentList sl = new StudentList();

        sl.addStudent(new Student("A B", "24"));
        sl.addStudent(new Student("idk who", "07"));
        sl.addStudent(new Student("def", "32"));
        sl.addStudent(new Student("xyz", "17"));

        sl.displayStudentList(); //Displaying created Students List

        sl.sortByName(); //Sorting the list by students names
        System.out.println("Name Sorted:");
        sl.displayStudentList();

        sl.sortBySeatNo(); //Sorting the list by students seat numbers
        System.out.println("SeatNo Sorted:");
        sl.displayStudentList();

        sl.findStudent("17"); //Searching a student from the created list
        sl.findStudent("7"); //When required student is not in the list

        sl.removeStudent("24"); //Removing a student from the list
        sl.displayStudentList();
    }
}