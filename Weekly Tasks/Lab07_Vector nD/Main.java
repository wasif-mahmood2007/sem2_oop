public class Main {
    public static void main(String[] args)
    {
        //Creating a Vector using Default Constructor
        Vector v1 = new Vector();
        v1.addCoordinate(2);
        v1.addCoordinate(4);
        v1.addCoordinate(8);
        v1.addCoordinate(16);
        v1.addCoordinate(32);
        System.out.println("Vector: " +v1); //Displaying created vector

        //Creating a Vector using Parameterized Constructor
        Vector v2 = new Vector(5.5, 16.2, 9.7);
        System.out.println("Second Vector: " +v2); //Displaying second vector

        //Dimensions of Vector
        System.out.println("First Vector is " +v1.dimensions()+ "D");
        System.out.println("Second Vector is " +v2.dimensions()+ "D");

        //Removing Coordinates
        v1.removeCoordinate(8);
        v1.removeCoordinateByIndex(3); //index 3: 32
        System.out.println("Vector after removing two coordinates: " +v1);
        System.out.println("Vector is now " +v1.dimensions()+ "D");

        //Magnitude of Vector
        System.out.println("Magnitude of vector: " +v1.magnitude());

        //Addition of two Vectors
        Vector vSum = v1.addTwoVectors(v2);
        System.out.println("Added Vectors: " +vSum);

        //Subtraction of two Vectors
        Vector vDiff = v2.subtractTwoVectors(v1);
        System.out.println("Subtracted Vectors: " +vDiff);

        //Dot Product of two Vectors
        System.out.println("Dot Product of " +v1+ " & " +v2+ ": " +v1.dotProduct(v2));

        //Cross Product of two Vectors
        System.out.println("Cross Product of " +v1+ " & " +v2+ ": " +v1.crossProduct(v2));

        //Clearing a Vector
        v1.clearVector();
        System.out.println("Cleared Vector: " +v1);
    }
}