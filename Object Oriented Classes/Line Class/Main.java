public class Main {
    public static void main(String[] args)
    {
        //Using Default Constructor to create Custom Line
        Line l1 = new Line();
        l1.setStartX(7);
        l1.setStartY(8);
        l1.setEndX(21);
        l1.setEndY(17);
        l1.setColor("Blue");
        l1.setThickness(3);
        System.out.println(l1.show());

        //Using Parameterized Constructor to create Custom Line
        Line l2 =  new Line(-2, 5, 9, -4, "Yellow", 2);
        System.out.println(l2.show());

        //Using Default Constructor with default values
        Line l3 = new Line();
        System.out.println(l3.show());
    }
}