public class Main {
    public static void main(String[] args)
    {
        //Shallow Copy testing
        System.out.println("SHALLOW COPYING:");
        Shallow s1 = new Shallow("Wasif", 59, 3.8);
        System.out.println(s1);

        Shallow s1Copy = s1.clone();
        System.out.println(s1Copy);

        s1.setName("ABC");
        s1.setSeatNo(67);
        s1.gpa.setCGPA(4.0);
        System.out.println(s1+ "\n" +s1Copy);
        //Copies an object's attributes, but does not copy the objects/arrays. It just copies their references.


        //Deep Copy testing
        System.out.println("\nDEEP COPYING:");
        Deep s2 = new Deep("Wasif", 59, 3.8);
        System.out.println(s2);

        Deep s2Copy = s2.clone();
        System.out.println(s2Copy);

        s2.setName("ABC");
        s2.setSeatNo(67);
        s2.gpa.setCGPA(4.0);
        System.out.println(s2+ "\n" +s2Copy);
        //It created a new object for the clone, making it independent of the source object.
    }
}