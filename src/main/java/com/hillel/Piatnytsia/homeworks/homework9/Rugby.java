package com.hillel.Piatnytsia.homeworks.homework9;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {
        int[] ageFirstTeamPlayers = new int[25];
        int[] ageSecondTeamPlayers = new int[25];

        int minAge = 18;
        int maxAge = 40;
        int sumAgeFirstTeam = 0;
        int sumAgeSecondTeam = 0;
        double averageAgeFirstTeam;
        double averageAgeSecondTeam;

        for (int i = 0; i < ageFirstTeamPlayers.length; i++) {
            ageFirstTeamPlayers[i] = (int) ((Math.random() * (maxAge - minAge + 1)) + minAge);
            sumAgeFirstTeam += ageFirstTeamPlayers[i];
        }
        averageAgeFirstTeam = (double) sumAgeFirstTeam / ageFirstTeamPlayers.length;

        for (int i = 0; i < ageSecondTeamPlayers.length; i++) {
            ageSecondTeamPlayers[i] = (int) ((Math.random() * (maxAge - minAge + 1)) + minAge);
            sumAgeSecondTeam += ageSecondTeamPlayers[i];
        }
        averageAgeSecondTeam = (double) sumAgeSecondTeam / ageSecondTeamPlayers.length;

        System.out.println("Вік від 1-25 гравця першої команди " + Arrays.toString(ageFirstTeamPlayers));
        System.out.println("Вік від 1-25 гравця другої команди " + Arrays.toString(ageSecondTeamPlayers));
        System.out.println("Середній вік першої команди: " + averageAgeFirstTeam);
        System.out.println("Середній вік другої команди: " + averageAgeSecondTeam);
    }
}
