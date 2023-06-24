package Entities;

import Enums.Gender;

public abstract class CommonAtt {
    private String name;
    private String phoneNo;
    private Integer age;
    private Integer idNo;
    Gender gender;

    public CommonAtt(String name, String phoneNo, Integer age, Integer idNo, Gender gender) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.age = age;
        this.idNo = idNo;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getIdNo() {
        return idNo;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "CommonAtt{" +
                "name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                ", age=" + age +
                ", idNo=" + idNo +
                '}';
    }
    }

