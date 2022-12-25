package com.hillel.Piatnytsia.homeworks.homework13.v2;

public class Burger {
    String loaf;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger() {
        loaf = "булочка";
        meat = "м'ясо";
        cheese = "сир";
        greens = "зелень";
        System.out.printf("В склад дієтичного бургеру входить: %s, %s, %s, %s.", loaf, meat, cheese, greens);
    }

    public Burger(boolean isDoubleMeat) {
        loaf = "булочка";
        meat = "м'ясо";
        cheese = "сир";
        greens = "зелень";
        mayonnaise = "майонез";
        printInfo(isDoubleMeat);
    }

    private void printInfo(boolean isDoubleMeat) {
        System.out.printf("В склад %s бургеру входить: %s, %s, %s, %s, %s.\n",
                isDoubleMeat ? "подвійного м'ясного" : "звичайного",
                loaf,
                isDoubleMeat ? "подвійне м'ясо" : "м'ясо", cheese, greens, mayonnaise);
    }
}
