public abstract class Animal {
    protected String name;
    protected String type;
    protected int legCount;
    protected String color;
    protected double weightPounds;

    //Parameterized Constructor
    public Animal(String n, String t, int l, String c, double w)
    {
        this.name=n;
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

    //Abstract Methods
    public abstract String makeNoise();
    public abstract boolean areAggressive();

    //toString
    @Override
    public String toString()
    {
        return "[Name: "+name+" | Type: "+type+" | Legs: "+legCount+" | Color: "+color+" | Weight: "+weightPounds+" Pounds]";
    }
}