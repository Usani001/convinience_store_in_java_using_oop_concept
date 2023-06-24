import Entities.Cashier;
import Entities.Customers;
import Entities.Manager;
import Entities.Products;
import Enums.Gender;
import Services.CashierDo;
import Services.Customer;
import Services.CustomerDo;
import Services.ManagerDo;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ConStore {
    public static void main(String[] args) {
        Manager manager = new Entities.Manager("Usani","2348054135933",59,98,Gender.Male);
        Cashier cashier = new Cashier("Gideon","07030392345",26,456,Gender.Male,34);
        Customers customers = new Customers("Emeka",+234885885,20);
        Products products = new Products("Soap",5413,56);

        ManagerDo managerDo = new Services.Manager();
        CashierDo cashierDo = new Services.Cashier();
        CustomerDo customerDo = new Services.Customer();
        cashierDo.dispense();
        customerDo.buy();
        managerDo.hire();
        cashierDo.sale();
        cashierDo.giveReport();






    }

}