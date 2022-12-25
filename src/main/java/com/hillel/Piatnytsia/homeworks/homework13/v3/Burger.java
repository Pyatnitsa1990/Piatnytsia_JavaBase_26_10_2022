package com.hillel.Piatnytsia.homeworks.homework13.v3;

public class Burger {
    String loaf;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String loaf, String meat, String cheese, String greens) {
        this.loaf = loaf;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        printInfoAboutDietBurger();
    }

    public Burger(String loaf, boolean isDoubleMeat, String cheese, String greens, String mayonnaise) {
        this.loaf = loaf;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        printInfo(isDoubleMeat);
    }

    private void printInfoAboutDietBurger() {
        System.out.println("В склад дієтичного бургеру входить: " + loaf + ", " + meat + ", " + cheese + ", " + greens + ".");
    }

    private void printInfo(boolean isDoubleMeat) {
        System.out.printf("В склад %s бургеру входить: %s, %s, %s, %s, %s.\n",
                isDoubleMeat ? "подвійного м'ясного" : "звичайного",
                loaf,
                isDoubleMeat ? "подвійне м'ясо" : "м'ясо", cheese, greens, mayonnaise);
    }
}
