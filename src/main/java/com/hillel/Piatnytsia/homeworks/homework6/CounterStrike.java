package com.hillel.Piatnytsia.homeworks.homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я первої команди");
        String firstTeamName = scanner.nextLine();
        System.out.println("Введіть кількість фрагів першого гравця першої команди:");
        double countFrag1PlayerFirstTeam = scanner.nextDouble();
        System.out.println("Введіть кількість фрагів другого гравця першої команди:");
        double countFrag2PlayerFirstTeam = scanner.nextDouble();
        System.out.println("Введіть кількість фрагів третього гравця першої команди:");
        double countFrag3PlayerFirstTeam = scanner.nextDouble();
        System.out.println("Введіть кількість фрагів четвертого гравця першої команди:");
        double countFrag4PlayerFirstTeam = scanner.nextDouble();
        System.out.println("Введіть кількість фрагів п'ятого гравця першої команди:");
        double countFrag5PlayerFirstTeam = scanner.nextDouble();


        System.out.println("Введіть ім'я другої команди");
        String secondTeamName = scanner.next();

        System.out.println("Введіть кількість фрагів першого гравця другої команди:");
        double countFrag1PlayerSecondTeam = scanner.nextDouble();
        System.out.println("Введіть кількість фрагів другого гравця другої команди:");
        double countFrag2PlayerSecondTeam = scanner.nextDouble();
        System.out.println("Введіть кількість фрагів третього гравця другої команди:");
        double countFrag3PlayerSecondTeam = scanner.nextDouble();
        System.out.println("Введіть кількість фрагів четвертого гравця другої команди:");
        double countFrag4PlayerSecondTeam = scanner.nextDouble();
        System.out.println("Введіть кількість фрагів п'ятого гравця другої команди:");
        double countFrag5PlayerSecondTeam = scanner.nextInt();

        int countPlayersEachTeam = 5;

        double averageFragFirstTeam = (countFrag1PlayerFirstTeam + countFrag2PlayerFirstTeam + countFrag3PlayerFirstTeam + countFrag4PlayerFirstTeam + countFrag5PlayerFirstTeam) / countPlayersEachTeam;
        double averageFragSecondTeam = (countFrag1PlayerSecondTeam + countFrag2PlayerSecondTeam + countFrag3PlayerSecondTeam + countFrag4PlayerSecondTeam + countFrag5PlayerSecondTeam) / countPlayersEachTeam;


        if (averageFragFirstTeam > averageFragSecondTeam) {
            System.out.println("Перемогла команда " + firstTeamName + " набравши " + averageFragFirstTeam + " очків");
        } else if (averageFragFirstTeam < averageFragSecondTeam) {
            System.out.println("Перемогла команда " + secondTeamName + " набравши " + averageFragSecondTeam + " очків");
        } else {
            System.out.println("Нічия, обидві команди набрали по " + averageFragFirstTeam + " очків");
        }
    }
}
