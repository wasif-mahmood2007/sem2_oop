public class Hero {
    private String name;
    private int age;
    private String dress;
    private String power;
    private String weapon;

    //Default Constructor
    public Hero()
    {
        name="John Doe";
        age=18;
        dress="Black";
        power="Invisibilty";
        weapon="Fist";
    }

    //Parameterized Constructor
    public Hero(String name, int age, String dress, String power, String weapon)
    {
        this.name=name;

        if(age>=0) //age can't be negetive
        {
            this.age=age;
        }
        else
        {
            throw new IllegalArgumentException("Age must be positive");
        }

        this.dress=dress;
        this.power=power;
        this.weapon=weapon;
    }

    //Setters and Getters
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        if(age>=0) //age can't be negetive
        {
            this.age=age;
        }
        else
        {
            throw new IllegalArgumentException("Age must be positive");
        }
    }
    public int getAge()
    {
        return age;
    }

    public void setDress(String dress)
    {
        this.dress=dress;
    }
    public String getDress()
    {
        return dress;
    }

    public void setPower(String power)
    {
        this.power=power;
    }
    public String getPower()
    {
        return power;
    }

    public void setWeapon(String weapon)
    {
        this.weapon=weapon;
    }
    public String getWeapon()
    {
        return weapon;
    }

    //Print Method
    public String display()
    {
        return "Your hero is "+name+", "+age+" years old with "+dress+" costume on. He/She have "+power+" superpower and uses "+weapon+" as their weapon."; //goddamn too much english for me 🙏
    }
}
