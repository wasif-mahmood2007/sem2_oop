public class Teddy extends CuddlyToy {
    //Constructor
    public Teddy(String job, String color, int size)
    {
        super("Teddy", job, color, size);
    }

    //Teddys growl
    public String toyNoise()
    {
        return "Teddy: *growl*";
    }
}