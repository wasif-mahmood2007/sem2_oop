public class Cat implements Animal {
    private String name;
    private String type;
    private int legCount;
    private String color;
    private double weightPounds;

    //Parameterized Constructor
    public Cat(String t, int l, String c, double w)
    {
        this.name="Cat";
        this.type=t;
        this.legCount=l;
        this.color=c;
        this.weightPounds=w;
    }

    //Getters
    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    public int getLegCount()
    {
        return legCount;
    }
    public String getColor()
    {
        return color;
    }
    public double getWeightPounds()
    {
        return weightPounds;
    }

    //Setters
    public void setName(String n)
    {
        this.name=n;
    }
    public void setType(String t)
    {
        this.type=t;
    }
    public void setLegCount(int l)
    {
        this.legCount=l;
    }
    public void setColor(String c)
    {
        this.color=c;
    }
    public void setWeightPounds(double w)
    {
        this.weightPounds=w;
    }

    //Inherited Methods
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

    //toString
    @Override
    public String toString()
    {
        return "[Name: "+name+" | Type: "+type+" | Legs: "+legCount+" | Color: "+color+" | Weight: "+weightPounds+" Pounds]";
    }
}