import java.util.ArrayList;

public class Vector {
    private ArrayList<Double> coordinates;

    //Default Constructor
    public Vector()
    {
        this.coordinates = new ArrayList<>();
    }

    //Parameterized Constructor using varargs
    public Vector(double... coord)
    {
        this.coordinates = new ArrayList<>();
        for(double c: coord)
        {
            this.coordinates.add(c);
        }
    }

    //Deep Copy(Copy Constructor)
    public Vector(Vector v)
    {
        this.coordinates = new ArrayList<>();
        for(int i=0; i<v.coordinates.size(); i++)
        {
            this.coordinates.add(v.coordinates.get(i));
        }
    }

    //Shallow Copy(Method)
    public Vector shallowCopy()
    {
        Vector shallowCopy = new Vector();
        shallowCopy.coordinates = this.coordinates;
        return shallowCopy;
    }

    //Get a Coordinate
    public double getCoordinate(int index)
    {
        if(index < 0 || index >= this.coordinates.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            return this.coordinates.get(index);
        }
    }

    //Set(Update) a Coordinate
    public void setCoordinate(int index, double coordinate)
    {
        if(index < 0 || index >= this.coordinates.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            this.coordinates.set(index, coordinate);
        }
    }

    //Add a Coordinate
    public void addCoordinate(double coordinate)
    {
        this.coordinates.add(coordinate);
    }

    //Add Multiple Coordinates
    public void addMultipleCoordinates(double... cord)
    {
        for(double c: cord)
        {
            this.coordinates.add(c);
        }
    }

    //Remove a Coordinate using Index of Coordinate
    public void removeByIndex(int index)
    {
        if(index < 0 || index >= this.coordinates.size())
        {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        else
        {
            this.coordinates.remove(index);
            System.out.println("Coordinate removed successfully.");
        }
    }

    //Remove a Coordinate using Coordinate value
    public void removeByValue(double coordinate)
    {
        for(int i=0; i<this.coordinates.size(); i++)
        {
            if(coordinate == this.coordinates.get(i))
            {
                this.coordinates.remove(i);
                System.out.println("Coordinate removed successfully.");
                return;
            }
        }
        System.out.println("Coordinate not found.");
    }

    //Remove Multiple Coordinates
    public void removeMultipleByIndex(int... indexes)
    {
        //Sorting indexes in descending order to avoid possible error.
        for(int i=0; i < indexes.length; i++)
        {
            for(int j=i+1; j<indexes.length; j++)
            {
                if(indexes[i] < indexes[j])
                {
                    int temp = indexes[i];
                    indexes[i] = indexes[j];
                    indexes[j] = temp;
                }
            }
        }
        
        for(int i: indexes)
        {
            if(i < 0 || i >= this.coordinates.size())
            {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
            else
            {
                this.coordinates.remove(i);
            }
        }
        System.out.println("Coordinates removed succesfully.");
    }

    //Find a Coordinate
    public String findCoordinate(double coordinate)
    {
        for(int i=0; i<this.coordinates.size(); i++)
        {
            if(coordinate == this.coordinates.get(i))
            {
                return "Coordinate \"" +coordinate+ "\" found at index " +i+ ".";
            }
        }
        return "Coordinate \"" +coordinate+ "\" not found.";
    }

    //Check if two vectors are equal
    public boolean equals(Vector v)
    {
        return this.coordinates.equals(v.coordinates);
    }

    //Dimensions of Vector
    public int dimensions()
    {
        return this.coordinates.size();
    }

    //Length of Vector
    public double getLength()
    {
        double underTheRoot=0;
        for(int i=0; i<this.coordinates.size(); i++)
        {
            double sq = this.coordinates.get(i) * this.coordinates.get(i);
            underTheRoot = underTheRoot + sq;
        }
        return Math.sqrt(underTheRoot);
    }

    //Addition of Vectors
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

    //Subtraction of Vectors
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

    //Dot Product of Vectors
    public double dotProduct(Vector v)
    {
        if(this.dimensions() != v.dimensions())
        {
            throw new IllegalArgumentException("Vectors should must have same dimensions for dot product.");
        }

        double vDP = 0;
        for(int i=0; i<this.dimensions(); i++)
        {
            double product = this.getCoordinate(i) * v.getCoordinate(i);
            vDP = vDP + product;
        }
        return vDP;
    }

    //Cross Product of 3D Vectors
    public Vector crossProduct(Vector v)
    {
        if(this.dimensions() != 3 || v.dimensions() != 3)
        {
            throw new IllegalArgumentException("Both vectors must be 3D for cross product.");
        }

        double i = (this.getCoordinate(1) * v.getCoordinate(2)) - (this.getCoordinate(2) * v.getCoordinate(1));
        double j = (this.getCoordinate(2) * v.getCoordinate(0)) - (this.getCoordinate(0) * v.getCoordinate(2));
        double k = (this.getCoordinate(0) * v.getCoordinate(1)) - (this.getCoordinate(1) * v.getCoordinate(0));

        Vector vCP = new Vector(i, j, k);
        return vCP;
    }

    //Clear Vector
    public void clearVector()
    {
        this.coordinates.clear();
    }

    //Override toString() to return vector in readable form
    @Override
    public String toString()
    {
        return coordinates.toString();
    }

}
