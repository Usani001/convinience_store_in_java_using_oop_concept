package models;

public class Customers {
    public String getName;
    public Integer getPhoneNo;
    private Integer buy;

    public Customers(String getName, Integer getPhoneNo, Integer buy) {
        this.getName = getName;
        this.getPhoneNo = getPhoneNo;
        this.buy = buy;
        if (buy == 10) {
            System.out.println("Give discount");
        }
    }

    @Override
    public String toString() {
        return "Customers{" +
                "getName='" + getName + '\'' +
                ", getPhoneNo=" + getPhoneNo +
                ", buy='" + buy + '\'' +
                '}';
    }
}
