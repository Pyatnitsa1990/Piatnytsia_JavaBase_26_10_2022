package com.hillel.Piatnytsia.homeworks.homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введіть ім'я первої команди");
        String firstTeamName = scanner1.nextLine();
        System.out.println("Введіть кількість фрагів першого гравця першої команди:");
        int countFrag1PlayerFirstTeam = scanner1.nextInt();
        System.out.println("Введіть кількість фрагів другого гравця першої команди:");
        int countFrag2PlayerFirstTeam = scanner1.nextInt();
        System.out.println("Введіть кількість фрагів третього гравця першої команди:");
        int countFrag3PlayerFirstTeam = scanner1.nextInt();
        System.out.println("Введіть кількість фрагів четвертого гравця першої команди:");
        int countFrag4PlayerFirstTeam = scanner1.nextInt();
        System.out.println("Введіть кількість фрагів п'ятого гравця першої команди:");
        int countFrag5PlayerFirstTeam = scanner1.nextInt();

        double countPlayersEachTeam = 5.0;

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введіть ім'я другої команди");
        String secondTeamName = scanner2.nextLine();
        System.out.println(secondTeamName);
        System.out.println("Введіть кількість фрагів першого гравця другої команди:");
        int countFrag1PlayerSecondTeam = scanner2.nextInt();
        System.out.println("Введіть кількість фрагів другого гравця другої команди:");
        int countFrag2PlayerSecondTeam = scanner2.nextInt();
        System.out.println("Введіть кількість фрагів третього гравця другої команди:");
        int countFrag3PlayerSecondTeam = scanner2.nextInt();
        System.out.println("Введіть кількість фрагів четвертого гравця другої команди:");
        int countFrag4PlayerSecondTeam = scanner2.nextInt();
        System.out.println("Введіть кількість фрагів п'ятого гравця другої команди:");
        int countFrag5PlayerSecondTeam = scanner2.nextInt();


        int resultFirstTeam = (countFrag1PlayerFirstTeam + countFrag2PlayerFirstTeam + countFrag3PlayerFirstTeam + countFrag4PlayerFirstTeam + countFrag5PlayerFirstTeam);
        System.out.println(resultFirstTeam);
        double averageFragFirstTeam = resultFirstTeam / countPlayersEachTeam;
        System.out.println(averageFragFirstTeam);
        int resultSecondTeam = (countFrag1PlayerSecondTeam + countFrag2PlayerSecondTeam + countFrag3PlayerSecondTeam + countFrag4PlayerSecondTeam + countFrag5PlayerSecondTeam);
        System.out.println(resultSecondTeam);

        double averageFragSecondTeam = resultSecondTeam / countPlayersEachTeam;
        System.out.println(averageFragSecondTeam);


        if (resultFirstTeam > resultSecondTeam) {
            System.out.println("Перемогла команда " + firstTeamName + " набравши " + resultFirstTeam);
        } else {
            System.out.println("Перемогла команда " + secondTeamName + " набравши " + resultSecondTeam);
        }
    }
}
