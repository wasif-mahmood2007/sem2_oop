public class Main {
    public static void main(String[] args)
    {
        //Creating a vector using default constructor
        Vector v1 = new Vector();
        v1.addCoordinate(2);
        v1.addCoordinate(4);
        v1.addMultipleCoordinates(8, 16, 32);
        System.out.println("Vector: " +v1); //Displaying created vector

        //Creating a vector using parameterized constructor
        Vector v2 = new Vector(5.5, 16.2, 9.7, 35.9, -8, 51.3);
        System.out.println("Second Vector: " +v2); //Displaying second vector

        //Dimensions of vector
        System.out.println("First Vector is " +v1.dimensions()+ "D");
        System.out.println("Second Vector is " +v2.dimensions()+ "D");

        //Finding a coordinate from a vector
        System.out.println(v2.findCoordinate(3));
        System.out.println(v2.findCoordinate(35.9));

        //Deep copy
        Vector deepCopy = new Vector(v1);
        System.out.println("Deep Copy of First Vector: " + deepCopy);

        //Shallow copy creation, will change if the source vector changes
        Vector shallowCopy = v2.shallowCopy();
        System.out.println("Shallow Copy of Second Vector: " + shallowCopy);

        //Removing coordinates using three created methods
        v1.removeByValue(8);
        v1.removeByIndex(3); //index 3: 32
        System.out.println("First Vector after removing two coordinates: " +v1);
        System.out.println("First Vector is now " +v1.dimensions()+ "D");
        v2.removeMultipleByIndex(4, 3, 5);
        System.out.println("Second Vector after removing three coordinates: " +v2);
        System.out.println("Second Vector is now " +v2.dimensions()+ "D");

        //Shallow copy changed after the source changed
        System.out.println("Shallow Copy of Second Vector is now: " + shallowCopy);

        //Length of vector
        System.out.println("Magnitude of vector: " +v1.getLength());

        //Addition of two vectors
        Vector vSum = v1.addTwoVectors(v2);
        System.out.println("Added Vectors: " +vSum);

        //Subtraction of two vectors
        Vector vDiff = v2.subtractTwoVectors(v1);
        System.out.println("Subtracted Vectors: " +vDiff);

        //Dot product of two vectors
        System.out.println("Dot Product of " +v1+ " & " +v2+ ": " +v1.dotProduct(v2));

        //Cross product of two vectors
        System.out.println("Cross Product of " +v1+ " & " +v2+ ": " +v1.crossProduct(v2));

        //Checking vectors equality
        Vector v3 = new Vector(1, 2, 3);
        Vector v4 = new Vector(1, 2, 3);
        if(v3.equals(v4))
        {
            System.out.println("Vectors " +v3+ " & " +v4+ " are Equal.");
        }
        else
        {
            System.out.println("Vectors " +v3+ " & " +v4+ " are Not Equal.");
        }

        //Clearing a vector
        v1.clearVector();
        System.out.println("Cleared Vector: " +v1);
    }
}