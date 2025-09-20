public class Main{
    public static void main(String[] args)
    {
        //Using Default Constructor to create Custom Line
        Pen p1 = new Pen();
        p1.setCompany("Dollar");
        p1.setType("Marker");
        p1.setInkColor("Blue");
        p1.setPrice(20);
        System.out.println(p1.display());

        //Using Parameterized Constructor to create Custom Line
        Pen p2 = new Pen("Signature", "Ballpoint", "Red", 12);
        System.out.println(p2.display());

        //Using Default Constructor with default values
        Pen p3 = new Pen();
        System.out.println(p3.display());
    }
}