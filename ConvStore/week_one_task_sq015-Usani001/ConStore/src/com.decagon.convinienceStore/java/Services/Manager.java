package Services;

public class Manager implements ManagerDo {
    @Override
    public void hire() {
        System.out.println("Manager will hire Cashier");
    }

    @Override
    public void fire() {
        System.out.println("Manager will fire Cashier");
    }

}
