public class Main {
    public static void main(String[] args)
    {
        //Two-Dimentional Point
        Point2D p1 = new Point2D(4.6, 12.2);
        System.out.println(p1);

        //Three-Dimentional Point
        Point3D p2 = new Point3D(47.0, 69.67, 5.25);
        System.out.println(p2);

        //Update Coordinates
        p2.setXCord(p2.getYCord());
        p2.setYCord(80.3);
        System.out.println(p2);
    }
}