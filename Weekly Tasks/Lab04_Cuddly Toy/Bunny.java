public class Bunny extends CuddlyToy {
    //Constructor
    public Bunny(String job, String color, int size)
    {
        super("Bunny", job, color, size);
    }

    //Bunnys squeak
    public String toyNoise()
    {
        return "Bunny: *squeak*";
    }
}