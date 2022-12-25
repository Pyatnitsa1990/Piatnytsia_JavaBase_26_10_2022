package com.hillel.Piatnytsia.homeworks.homework13.v1;

import com.hillel.Piatnytsia.homeworks.homework13.v1.ingridients.*;

public class Burger {
    Loaf loaf;
    Meat meat;
    Cheese cheese;
    Mayonnaise mayonnaise;
    Greens greens;

    public Burger() {
        Loaf loaf = new Loaf();
        Meat meat = new Meat();
        Cheese cheese = new Cheese();
        Greens greens = new Greens();
        System.out.printf("\nВ склад діетичного бургеру входить: %s, %s, %s, %s", loaf, meat, cheese,greens);
    }

    public Burger(boolean isDoubleBurger) {
        mayonnaise = new Mayonnaise();
        Loaf loaf = new Loaf();
        Meat meat = isDoubleBurger ? new Meat("подвійне м'ясо") : new Meat();
        Cheese cheese = new Cheese();
        Greens greens = new Greens();

        System.out.printf("\nВ склад %s бургеру входить: %s, %s, %s, %s, %s",
                isDoubleBurger ? "подвійного м'ясного" : "звичайного",
                loaf, meat, cheese, greens, this.mayonnaise);
    }

}
