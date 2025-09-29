public class Main {
    public static void main(String[] args)
    {
        //Creating Points
        Point point1 = new Point(2, 4);
        Point point2 = new Point(5, 7);
        System.out.println(point1);

        //Creating Pen "pen1"
        Pen pen1 = new Pen("Green", 2.5);
        System.out.println(pen1);

        //Drawing a Line using pen1
        String line = pen1.drawLine(point1, point2);
        System.out.println(line);

        //Drawing a Triangle using pen1
        String triangle = pen1.drawTriangle(point1 , point2, new Point(7, -2));
        System.out.println(triangle);

        //Refilling pen1 with Blue ink
        pen1.setInkColor("Blue");

        //Drawing a Quadrilateral using pen1
        String quadrilateral = pen1.drawQuadrilateral(point1, point2, new Point(-3.6, 0.4), new Point(5.7, 8.1));
        System.out.println(quadrilateral);

        //Creating another Pen "pen2"
        Pen pen2 = new Pen("Red", 1.2);

        //Creating a Pentagon using pen2
        String Pentagon = pen2.drawShape(new Point(4.1, -1.8), new Point(6.4, 2.6), new Point(-2.3, 1.7), new Point(1.2, 5.3), new Point(0.5, -3.2));
        System.out.println(Pentagon);
    }
}