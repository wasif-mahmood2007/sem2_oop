public class Main {
    public static void main(String[] args)
    {
        //Cashier
        Cashier cashierMike = new Cashier("Mike", 3712);
        System.out.println(cashierMike);

        //Customer
        Customer customerAmelia = new Customer("Amelia", 10000);
        System.out.println(customerAmelia);

        //Change calculation
        System.out.println("Change given: " +customerAmelia.payBill(cashierMike));

        //Another customer wants change with 500 notes
        Cashier cashierChris = new Cashier("Chris", 240);
        Customer customerJill = new Customer("Jill", 5000);
        System.out.println("Change given: " +customerJill.payBillAndRequestPreferredNotes(cashierChris, 500));
    }
}