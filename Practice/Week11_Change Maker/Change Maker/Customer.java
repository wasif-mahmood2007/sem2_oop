import java.util.ArrayList;

public class Customer extends Person {
    private int cash;

    //Constructor
    public Customer(String name, int cash)
    {
        super(name);
        this.cash=cash;
    }

    //Pay bill to cashier
    public ArrayList<Integer> payBill(Cashier cashier)
    {
        return cashier.makeChange(cash);
    }

    //Pay bill and request preferred notes
    public ArrayList<Integer> payBillAndRequestPreferredNotes(Cashier cashier, int preferredNote)
    {
        return cashier.makePreferredChange(cash, preferredNote);
    }

    //Override toString() to return customer details
    @Override
    public String toString()
    {
        return "Customer name is " +name+ ", and he/she got " +cash+ " in cash.";
    }
}