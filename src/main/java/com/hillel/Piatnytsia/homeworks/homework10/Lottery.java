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


        System.out.println(Arrays.toString(numbersMentionedFirm));
        System.out.println(Arrays.toString(numbersGuessPlayer));

        if (counter > 0) {
            System.out.println("Кількість збігів: " + counter);
            System.out.print("Збіги під індексом: ");
            for (int i = 0; i < numbersGuessPlayer.length; i++) {
                if (numbersMentionedFirm[i] == numbersGuessPlayer[i]) {
                    System.out.print(i + " ");
                }
            }
        }
        else{
            System.out.println("Збігів немає");
        }
    }
}