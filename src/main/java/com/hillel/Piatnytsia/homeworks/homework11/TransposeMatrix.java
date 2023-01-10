package com.hillel.Piatnytsia.homeworks.homework11;


import java.util.Random;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Будь-ласка введіть розмір матриці");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                int row = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    int column = scanner.nextInt();
                    if (row < 1 || column < 1) {
                        System.out.println("Будь-ласка введіть значення більше 0");
                        scanner.nextLine();
                        continue;
                    }
                    int[][] originalMatrix = new int[row][column];
                    int[][] transposeMatrix = new int[column][row];

                    System.out.println("\nОригінальна матриця");
                    for (int i = 0; i < originalMatrix.length; i++) {
                        for (int j = 0; j < originalMatrix[i].length; j++) {
                            originalMatrix[i][j] = random.nextInt(100);
                            System.out.print(originalMatrix[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    System.out.println("\nТранспонована матриця");
                    for (int i = 0; i < transposeMatrix.length; i++) {
                        for (int j = 0; j < transposeMatrix[i].length; j++) {
                            transposeMatrix[i][j] = originalMatrix[j][i];
                            System.out.print(transposeMatrix[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    break;

                }
                else{
                    scanner.nextLine();
                    continue;
                }
            }else {
                     scanner.nextLine();
                    System.out.println("Треба вказати числові значення");



            }
        }
    }
}