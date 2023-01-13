package com.hillel.Piatnytsia.homeworks.homework17;

import java.util.Scanner;

import static com.hillel.Piatnytsia.homeworks.homework17.Drinks.*;

public class Main {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("Будь-ласка введіть назву напою, який ви бажаєте: TEA, COFFEE, WATER, LEMONADE, MOJITO, COLA");
        Scanner scanner = new Scanner(System.in);
        String value = null;
        double totalSum = 0d;
        int drinksCount = 0;

        while (!"exit".equalsIgnoreCase(value)) {
            value = scanner.nextLine();
            Drinks drink;
            try {
                drink = Drinks.valueOf(value.toUpperCase());
            } catch (Exception ex) {
                if(!"exit".equalsIgnoreCase(value)){
                    System.out.println("Неправильно обраний напій, спробуйте ще раз");
                }
                    continue;

            }

            drinksCount++;
            switch (drink) {
                case TEA:
                    DrinkMachine.makeTea();
                    totalSum += TEA.getPrice();
                    break;
                case COFFEE:
                    DrinkMachine.makeCoffee();
                    totalSum += COFFEE.getPrice();
                    break;
                case LEMONADE:
                    DrinkMachine.makeLemonade();
                    totalSum += LEMONADE.getPrice();
                    break;
                case MOJITO:
                    DrinkMachine.makeMojito();
                    totalSum += MOJITO.getPrice();
                    break;
                case WATER:
                    DrinkMachine.makeWater();
                    totalSum += WATER.getPrice();
                    break;
                case COLA:
                    DrinkMachine.makeCola();
                    totalSum += COLA.getPrice();
                    break;
            }

        }
        System.out.printf("Кількіть замовлених напоїв %d\nЗагальна сума до сплати: %.2f", drinksCount, totalSum);
    }
}
