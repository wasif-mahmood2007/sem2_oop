import java.util.ArrayList;
import java.util.Arrays;

public class Cashier extends Person {
    private int bill;
    private ArrayList<Integer> denominations = new ArrayList<>(Arrays.asList(5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1));

    //Constructor
    public Cashier(String name, int bill)
    {
        super(name);
        this.bill=bill;
    }

    //Calculate balance to return
    public int calculateBalance(int paidAmount)
    {
        return paidAmount-bill;
    }

    //Change maker
    public ArrayList<Integer> makeChange(int paidAmount)
    {
        int balance = calculateBalance(paidAmount);
        ArrayList<Integer> change = new ArrayList<>();
        
        for(int i=0; balance>0; i++)
        {
            while(balance >= denominations.get(i))
            {
                change.add(denominations.get(i));
                balance = balance - denominations.get(i);
            }
        }
        return change;
    }

    //Change maker with preferred note
    public ArrayList<Integer> makePreferredChange(int paidAmount, int preferredNote)
    {
        int balance = calculateBalance(paidAmount);
        ArrayList<Integer> preferredChange = new ArrayList<>();

        for(int i=0; balance>0; i++)
        {
            if(denominations.get(i) <= preferredNote)
            {
                while(balance >= denominations.get(i))
            {
                preferredChange.add(denominations.get(i));
                balance = balance - denominations.get(i);
            }
            }
        }
        return preferredChange;
    }

    //Override toString() to return cashier details
    @Override
    public String toString()
    {
        return "Cashier name is " +name+ ", and bill was " +bill+ ".";
    }
}