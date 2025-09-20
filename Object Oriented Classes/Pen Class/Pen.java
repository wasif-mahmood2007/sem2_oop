public class Pen {
    private String company;
    private String type;
    private String inkColor;
    private int price;

    //Default Constructor
    public Pen()
    {
        company="Local";
        type="Pointer";
        inkColor="Black";
        price=10;
    }

    //Parameterized Constructor
    public Pen(String company, String type, String inkColor, int price)
    {
        this.company=company;
        this.type=type;
        this.inkColor=inkColor;
        
        if (price>=0) //price can't be negetive
        {
            this.price=price;
        }
        else
        {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
    }

    //Setters and Getters
    public void setCompany(String company)
    {
        this.company=company;
    }
    public String getCompany()
    {
        return company;
    }

    public void setType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return type;
    }

    public void setInkColor(String inkColor)
    {
        this.inkColor=inkColor;
    }
    public String getInkColor()
    {
        return inkColor;
    }

    public void setPrice(int price)
    {
        if (price>=0) //price can't be negetive
        {
            this.price=price;
        }
        else
        {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
    }
    public int getPrice()
    {
        return price;
    }

    //Print Method
    public String display()
    {
        return "It is "+company+"'s "+type+" with "+inkColor+" ink for "+price+" Pkr.";
    }
}
