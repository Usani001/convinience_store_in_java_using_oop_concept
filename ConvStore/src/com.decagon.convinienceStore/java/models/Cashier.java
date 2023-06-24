package models;

import enums.Gender;

public class Cashier extends CommonAtt {
    private Integer target;

    public Cashier(String name, String phoneNo, Integer age, Integer idNo, Gender gender, Integer target) {
        super(name, phoneNo, age, idNo, gender);
        this.target = target;
        if (target >= 50) {
            System.out.println("Cashier has met monthly target, add 20% bonus");
        }else
            System.out.println("Cashier did not meet monthly target");
    }


    @Override
    public String toString() {
        return "Cashier{" +
                "target=" + target +
                ", gender=" + gender +
                '}';
    }
}
