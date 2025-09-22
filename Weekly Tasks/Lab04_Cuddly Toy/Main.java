public class Main {
    public static void main(String[] args)
    {
        //EngineDriver object
        EngineDriver driver = new EngineDriver(4);
        System.out.println(driver);
        System.out.println(driver.toyNoise());
        
        //Gardener object
        Gardener gardener = new Gardener(6);
        System.out.println(gardener);
        System.out.println(gardener.toyNoise());

        //Clown object
        Clown clown = new Clown(4);
        System.out.println(clown);
        System.out.println(clown.toyNoise());

        //BankManager object
        BankManager manager = new BankManager(8);
        System.out.println(manager);
        System.out.println(manager.toyNoise());

        //Out of Assignment / Practice 
        //Teddy object
        Teddy teddy = new Teddy("Unemployed", "Grey", 6);
        System.out.println(teddy);
        System.out.println(teddy.toyNoise());

        //Bunny object
        Bunny bunny = new Bunny("Clown", "Yellow", 4);
        System.out.println(bunny);
        System.out.println(bunny.toyNoise());

        //CuddlyToy object
        CuddlyToy toy = new CuddlyToy("Cat", "Dentist", "Orange", 8);
        System.out.println(toy);
        System.out.println(toy.toyNoise());
    }
}