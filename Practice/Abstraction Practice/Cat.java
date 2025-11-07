public class Cat extends Animal {
    //Parameterized Constructor
    public Cat(String t, int l, String c, double w)
    {
        super("Cat", t, l, c, w);
    }

    @Override
    public String makeNoise()
    {
        return "Meow";
    }

    @Override
    public boolean areAggressive()
    {
        return false;
    }
}