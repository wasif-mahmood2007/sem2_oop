public class Main {
    public static void main(String[] args)
    {
        Cat c = new Cat("Carnivorous mammal", 4, "White", 9);
        System.out.println(c);
        System.out.println(c.makeNoise());
        if(c.areAggressive())
        {
            System.out.println("Recommended to keep the distance.");
        }
        else
        {
            System.out.println("Safe to approach.");
        }
    }
}
