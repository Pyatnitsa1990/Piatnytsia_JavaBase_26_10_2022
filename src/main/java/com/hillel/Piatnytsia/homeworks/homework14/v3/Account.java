package com.hillel.Piatnytsia.homeworks.homework14.v3;

public class Account {
    private final String name;
    private final Date birthDay;
    private final String email;
    private final String mobilePhone;

    public Date getBirthDay() {
        return birthDay;
    }

    private String surname;
    private int weight;
    private int pressure;
    private int countSteps;
    private int age;

    public  int getAge() {
        return age;
    }

    public Account(String name, Date birthDay, String email, String mobilePhone, String surname, int weight, int pressure, int countSteps) {
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.countSteps = countSteps;
        this.age = 2020- getBirthDay().getYear();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getCountSteps() {
        return countSteps;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setCountSteps(int countSteps) {
        this.countSteps = countSteps;
    }


}
