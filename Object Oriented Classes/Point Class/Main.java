public class Main {
    public static void main(String[] args)
    {
        //Using Default Constructor to create Custom Point
        Point p1 = new Point();
        p1.setColor("Green");
        p1.setThickness(4);
        p1.setXCord(6);
        p1.setYCord(12);
        System.out.println(p1.show());

        //Using Parameterized Constructor to create Custom Point
        Point p2 = new Point("Red", 2, -4, 6);
        System.out.println(p2.show());

        //Using Default Constructor with default values
        Point p3 = new Point();
        System.out.println(p3.show());
    }

}
