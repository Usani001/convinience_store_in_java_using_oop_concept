package Services;

public class Cashier implements CashierDo{
    @Override
    public void dispense() {
        System.out.println("Cashier please dispense receipts");
    }

    @Override
    public void sale() {
        System.out.println("Cashier please sale products");
    }

    @Override
    public void giveReport() {
        System.out.println("Give report of products");
    }
}
