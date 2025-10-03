public class Main {
    public static void main(String[] args)
    {
        //Create Course List
        CourseList cl = new CourseList();

        cl.addCourse(new Course("Discrete Structures", "CS-358"));
        cl.addCourse(new Course("Digital Logic Design", "CS-354"));
        cl.addCourse(new Course("Object Oriented Programming", "CS-352"));
        cl.addMultipleCourses(new Course("Linear Algebra", "CS-356"), new Course("Ideology & Constitution of Pakistan", "CS-362"), new Course("Communication & Presentation Skills", "CS-360"));

        System.out.println(cl); //Displaying created Courses List

        cl.sortByCourseName(); //Sorting the list by course names
        System.out.println("Name Sorted:\n" +cl);


        cl.sortByCode(); //Sorting the list by courses codes
        System.out.println("Code Sorted:\n" +cl);

        cl.findCourse("CS-352"); //Searching a course from the created list
        cl.findCourse("CS-999"); //When required course is not in the list

        cl.removeByCode("CS-360"); //Removing a course from the list
        cl.removeMultipleCourses(3, 1); //Removing multiple from the list
        System.out.println(cl);

        CourseList clonecl = cl.clone(); //Cloning course list
        System.out.println("Cloned Course List: " + clonecl);


        //Create Student List
        StudentList sl = new StudentList();

        sl.addStudent(new Student("A B", "24"));
        sl.addStudent(new Student("idk who", "07"));
        sl.addMultipleStudents(new Student("def", "32"), new Student("xyz", "17"), new Student("cs", "14"));

        System.out.println(sl); //Displaying created Students List

        sl.sortByName(); //Sorting the list by student names
        System.out.println("Name Sorted:\n" +sl);

        sl.sortBySeatNo(); //Sorting the list by students seat numbers
        System.out.println("SeatNo Sorted:\n" +sl);

        sl.findStudent("17"); //Searching a student from the created list
        sl.findStudent("7"); //When required student is not in the list

        sl.removeBySeatNo("24"); //Removing a student from the list
        sl.removeMultipleStudents(1, 3);//Removing multiple students from the list
        System.out.println(sl);

        StudentList clonesl = sl.clone(); //Cloning student list
        System.out.println("Cloned Student List: " + clonesl);
    }
}
