package com.hillel.Piatnytsia.homeworks.homework7;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Спробуй відгадати ціле число, яке загадав комп'ютер у діапазоні від 0 до 10, але май наувазі у тебе 3 спроби");
        int counterAttemptsPlayer = 0;
        int randomComputerNumber = (int) (Math.random() * 11);

        while (counterAttemptsPlayer < 3) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number == randomComputerNumber) {
                    System.out.println("Вітаємо! Ви вгадали число загадане компьтером!");
                    break;
                } else if (counterAttemptsPlayer == 2 && number != randomComputerNumber) {
                    System.out.println("Невірно");
                    System.out.println("Вибачте але ви не вгадали, пощастить іншого разу;)");
                    break;

                } else {
                    System.out.println("Невірно");
                    scanner.nextLine();
                    counterAttemptsPlayer++;
                }

            } else {
                System.out.println("Будь-ласка введи число від 0 до 10");
                scanner.nextLine();
            }
        }
        System.out.println("Компьютером було загадано число: " + randomComputerNumber);
    }
}