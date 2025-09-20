public class Main{
    public static void main(String[] args)
    {
        //Using Default Constructor to create Custom Hero
        Hero h1 = new Hero();
        h1.setName("Spider Man");
        h1.setAge(20);
        h1.setDress("Spider Suit");
        h1.setPower("Agility");
        h1.setWeapon("Web Shooter");
        System.out.println(h1.display());

        //Using Parameterized Constructor to create Custom Hero
        Hero h2 = new Hero("Batman", 30, "Batsuit", "Intellect", "Batarang");
        System.out.println(h2.display());

        //Using Default Constructor with default values
        Hero h3 = new Hero();
        System.out.println(h3.display());
    }

}
