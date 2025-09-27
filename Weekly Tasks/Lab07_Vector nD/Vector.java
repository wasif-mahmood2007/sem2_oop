import java.util.ArrayList;

public class Vector {
    private ArrayList<Double> vectorCoordinates;

    //Default Constructor
    public Vector()
    {
        vectorCoordinates = new ArrayList<>();
    }

    //Parameterized Constructor using varargs
    public Vector(double... coordinates)
    {
        vectorCoordinates = new ArrayList<>();
        for (double c : coordinates)
        {
            vectorCoordinates.add(c);
        }
    }

    //Set(or Update) a Coordinate
    public void setCoordinate(int index, double coordinate)
    {
        if(index >= vectorCoordinates.size() || index < 0)
        {
            throw new IndexOutOfBoundsException("Index out of Bounds.");
        }
        else
        {
            vectorCoordinates.set(index, coordinate);
        }
    }

    //Get a Coordinate
    public double getCoordinate(int index)
    {
        if(index >= vectorCoordinates.size() || index < 0)
        {
            throw new IndexOutOfBoundsException("Index out of Bounds.");
        }
        else
        {
            return vectorCoordinates.get(index);
        }
    }

    //Add a Coordinate
    public void addCoordinate(double coordinate)
    {
        vectorCoordinates.add(coordinate);
    }

    //Remove a Coordinate using index number
    public void removeCoordinateByIndex(int index)
    {
        if(index >= vectorCoordinates.size() || index < 0)
        {
            throw new IndexOutOfBoundsException("Index out of Bounds.");
        }
        else
        {
            vectorCoordinates.remove(index);
            System.out.println("Coordinate Removed Successfully.");
        }
    }

    //Remove a Coordinate using coordinate value
    public void removeCoordinate(double coordinate)
    {
        for(int i=0; i<vectorCoordinates.size(); i++)
        {
            if(vectorCoordinates.get(i) == coordinate)
            {
                vectorCoordinates.remove(i);
                System.out.println("Coordinate Removed Successfully.");
                return;
            }
        }
        System.out.println("Coordinate not found.");
    }

    //Find a Coordinate
    public double findCoordinate(double coordinate)
    {
        for(int i=0; i<vectorCoordinates.size(); i++)
        {
            if(vectorCoordinates.get(i) == coordinate)
            {
                System.out.println("Coordinate Found: " +vectorCoordinates.get(i)+ " at index: " +i);
                return vectorCoordinates.get(i);
            }
        }
        System.out.println("Coordinate Not Found.");
        return 0;
    }

    //Dimensions of a Vector
    public int dimensions()
    {
        return vectorCoordinates.size();
    }

    //Magnitude of a Vector
    public double magnitude()
    {
        double underTheRoot=0;
        for(int i=0; i<vectorCoordinates.size(); i++)
        {
            double squareOfCoordinate = vectorCoordinates.get(i) * vectorCoordinates.get(i);
            underTheRoot = underTheRoot + squareOfCoordinate;
        }
        return Math.sqrt(underTheRoot);
    }

    //Add two Vectors of same dimensions
    public Vector addTwoVectors(Vector v)
    {
        if(this.dimensions() != v.dimensions())
        {
            throw new IllegalArgumentException("Vectors should must have same dimensions for addition.");
        }
        
        Vector vAdd = new Vector();
        for(int i=0; i<this.dimensions(); i++)
        {
            double sum = this.getCoordinate(i) + v.getCoordinate(i);
            vAdd.addCoordinate(sum);
        }
        return vAdd;
    }

    //Subtract two Vectors of same dimensions
    public Vector subtractTwoVectors(Vector v)
    {
        if(this.dimensions() != v.dimensions())
        {
            throw new IllegalArgumentException("Vectors should must have same dimensions for subtraction.");
        }

        Vector vSub = new Vector();
        for(int i=0; i<this.dimensions(); i++)
        {
            double difference = this.getCoordinate(i) - v.getCoordinate(i);
            vSub.addCoordinate(difference);
        }
        return vSub;
    }

    //Dot Product of two Vectors
    public double dotProduct(Vector v)
    {
        if(this.dimensions() != v.dimensions())
        {
            throw new IllegalArgumentException("Vectors should must have same dimensions for dot product.");
        }

        double dotProduct=0;
        for(int i=0; i<this.dimensions(); i++)
        {
            double product = this.vectorCoordinates.get(i) * v.vectorCoordinates.get(i);
            dotProduct = dotProduct + product;
        }
        return dotProduct;
    }

    //Cross Product of two 3D Vectors
    public Vector crossProduct(Vector v)
    {
        if(this.dimensions() != 3 || v.dimensions() != 3)
        {
            throw new IllegalArgumentException("Both vectors must be 3D for cross product.");
        }

        double i = (this.getCoordinate(1) * v.getCoordinate(2)) - (this.getCoordinate(2) * v.getCoordinate(1));
        double j = (this.getCoordinate(2) * v.getCoordinate(0)) - (this.getCoordinate(0) * v.getCoordinate(2));
        double k = (this.getCoordinate(0) * v.getCoordinate(1)) - (this.getCoordinate(1) * v.getCoordinate(0));
        
        Vector crossProduct = new Vector(i, j, k);
        return crossProduct;
    }

    //Clear Vector
    public void clearVector()
    {
        vectorCoordinates.clear();
    }

    //Override toString() to return vector in readable form
    @Override
    public String toString()
    {
        return vectorCoordinates.toString();
    }
}