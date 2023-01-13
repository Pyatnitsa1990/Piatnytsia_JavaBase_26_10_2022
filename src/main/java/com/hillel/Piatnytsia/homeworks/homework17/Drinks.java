package com.hillel.Piatnytsia.homeworks.homework17;

public enum Drinks {

    COFFEE(1.5, "кава"),
    TEA(1.2, "чай"),
    LEMONADE(2, "лімонад"),
    MOJITO(2.5, "мохіто"),
    WATER(0.9, "вода"),
    COLA(1.8, "кола");

    private double price;
    private String name;

    Drinks(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}


