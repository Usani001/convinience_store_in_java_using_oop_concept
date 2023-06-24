package Entities;



public class Products {
    private String getName;

    private Integer getIdNo;
    private Integer quantity;

    public Products(String getName, Integer getIdNo, Integer quantity) {
        this.getName = getName;
        this.getIdNo = getIdNo;
        this.quantity = quantity;

        if (quantity >= 50) {
            System.out.println("Store is fully stocked");
        } else
            System.out.println("Store needs to be restocked");
    }




}
