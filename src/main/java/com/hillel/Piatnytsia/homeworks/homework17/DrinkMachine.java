package com.hillel.Piatnytsia.homeworks.homework17;

import static com.hillel.Piatnytsia.homeworks.homework17.Drinks.*;

public class DrinkMachine {

    public static void makeTea() {
        System.out.println("Ваш " + TEA.getName() + " готується");
        System.out.println("Якщо бажаєте ще щось, зробить ваш вибір, а якщо ні введіть exit");
    }

    public static void makeCoffee() {
        System.out.println("Ваш " + COFFEE.getName() + " готується");
        System.out.println("Якщо бажаєте ще щось, зробить ваш вибір, а якщо ні введіть exit");
    }

    public static void makeMojito() {
        System.out.println("Ваш " + MOJITO.getName() + " готується");
        System.out.println("Якщо бажаєте ще щось, зробить ваш вибір, а якщо ні введіть exit");
    }

    public static void makeCola() {
        System.out.println("Можете забрати вашу " + COLA.getName());
        System.out.println("Якщо бажаєте ще щось, зробить ваш вибір, а якщо ні введіть exit");
    }

    public static void makeWater() {
        System.out.println("Можете забрати вашу " + WATER.getName());
        System.out.println("Якщо бажаєте ще щось, зробить ваш вибір, а якщо ні введіть exit");
    }

    public static void makeLemonade() {
        System.out.println("Ваш " + LEMONADE.getName() + " готується");
        System.out.println("Якщо бажаєте ще щось, зробить ваш вибір, а якщо ні введіть exit");
    }
}
