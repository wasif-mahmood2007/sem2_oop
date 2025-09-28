public class Person {
    protected String name; // accessible to subclasses

    //Default Constructor
    public Person()
    {
        this.name="Anonymous";
    }

    //Parameterized Constructor
    public Person(String name)
    {
        this.name=name;
    }

    //Setter
    public void setName(String name)
    {
        this.name=name;
    }

    //Getter
    public String getName()
    {
        return name;
    }

    //Override toString() to return name of the person
    @Override
    public String toString()
    {
        return name;
    }
}