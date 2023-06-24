package Entities;


import Enums.Gender;

public class  Manager extends CommonAtt {
    @Override
    public String toString() {
        return "Manager{" +
                "gender=" + gender +
                '}';
    }

    public Manager(String name, String phoneNo, Integer age, Integer idNo, Gender gender) {
        super(name, phoneNo, age, idNo, gender);


    }

}

