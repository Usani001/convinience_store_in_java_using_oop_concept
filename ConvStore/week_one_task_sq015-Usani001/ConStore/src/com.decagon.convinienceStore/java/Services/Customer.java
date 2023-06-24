package Services;

public class Customer implements CustomerDo {
    @Override
    public void buy() {
        System.out.println("Customer is buying Products");
    }
    @Override
    public void pay() {
        System.out.println("Customer is paying for products");
    }
    @Override
    public void walk() {

    }
}
