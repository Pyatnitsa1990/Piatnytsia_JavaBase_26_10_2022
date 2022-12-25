package com.hillel.Piatnytsia.homeworks.homework13.v1.ingridients;

public class Meat {
    String name;


    public Meat() {
        this.name = "м`ясо";
    }


    public Meat(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return name;
    }
}
