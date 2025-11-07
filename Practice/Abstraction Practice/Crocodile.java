public class Crocodile extends Animal {
    //Parameterized Constructor
    public Crocodile(String t, int l, String c, double w)
    {
        super("Crocodile", t, l, c, w);
    }

    @Override
    public String makeNoise()
    {
        return "Hissing";
    }

    @Override
    public boolean areAggressive()
    {
        return true;
    }
}