package com.hillel.Piatnytsia.homeworks.homework10;

import java.util.Arrays;


public class Lottery {
    public static void main(String[] args) {
        int[] numbersMentionedFirm = new int[7];
        int[] numbersGuessPlayer = new int[7];

        for (int i = 0; i < numbersMentionedFirm.length; i++) {
            numbersMentionedFirm[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < numbersGuessPlayer.length; i++) {
            numbersGuessPlayer[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(numbersMentionedFirm);
        Arrays.sort(numbersGuessPlayer);

        int counter = 0;
        for (int i = 0; i < numbersGuessPlayer.length; i++) {
            if (numbersMentionedFirm[i] == numbersGuessPlayer[i]) {
                counter++;
            }
        }
        int[] matchedNumbers = new int[counter];
        for (int i = 0; i < numbersGuessPlayer.length; i++) {
            if (numbersMentionedFirm[i] == numbersGuessPlayer[i]) {
                for (int j = 0; j < matchedNumbers.length; j++) {
                    matchedNumbers[j] = numbersMentionedFirm[i];
                }
            }
        }
        System.out.println(Arrays.toString(numbersMentionedFirm));
        System.out.println(Arrays.toString(numbersGuessPlayer));
        System.out.println("Кількість збігів: " + counter);
        System.out.println("Збіги під індексом: " + Arrays.toString(matchedNumbers));
    }
}