import models.Cashier;
import models.Customers;
import models.Manager;
import models.Products;
import enums.Gender;
import services.CashierDo;
import services.CustomerDo;
import services.ManagerDo;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ConStore {
    public static void main(String[] args) {
        Manager manager = new models.Manager("Usani","2348054135933",65,98,Gender.Male);
        Cashier cashier = new Cashier("Gideon","07030392345",26,456,Gender.Male,567);
        Customers customers = new Customers("Emeka",+234885885,20);
        Products products = new Products("Soap",5413,13);

        ManagerDo managerDo = new services.Manager();
        CashierDo cashierDo = new services.Cashier();
        CustomerDo customerDo = new services.Customer();
        cashierDo.dispense();
        customerDo.buy();
        managerDo.hire();
        cashierDo.sale();
        cashierDo.giveReport();
        System.out.println(manager.getGender());
    }

}