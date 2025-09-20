public class Main{
    public static void main(String[] args)
    {
        //Using Default Constructor to create Custom Triangle
        Triangle t1 = new Triangle();
        t1.setSideA(6);
        t1.setSideB(12);
        t1.setSideC(18);
        System.out.println(t1);

        //Using One-Parameter Constructor to create Custom Triangle
        Triangle t2 = new Triangle(4);
        System.out.println(t2);

        //Using Two-Parameter Constructor to create Custom Triangle
        Triangle t3 = new Triangle(8, 9);
        System.out.println(t3);

        //Using Three-Parameter Constructor to create Custom Triangle
        Triangle t4 = new Triangle(6, 8, 10);
        System.out.println(t4);

        //Using Copy Constructor to copy t3 and t4
        Triangle tCopy1 = new Triangle(t3);
        System.out.println(tCopy1);

        Triangle tCopy2 = new Triangle(t4);
        System.out.println(tCopy2);

        //Checking if t3 and t4 are Right angled triangles
        if(t3.isRightAngled() == true) //for t3
        {
            System.out.println("Triangle t3 is Right Angled");
        }
        else
        {
            System.out.println("Triangle t3 is NOT Right Angled");
        }

        if(t4.isRightAngled() == true) //for t4
        {
            System.out.println("Triangle t4 is Right Angled");
        }
        else
        {
            System.out.println("Triangle t4 is NOT Right Angled");
        }

        //Using Count method to print number of objects created.
        System.out.println("Triangle/s created: " + Triangle.objectCount());
    }
}