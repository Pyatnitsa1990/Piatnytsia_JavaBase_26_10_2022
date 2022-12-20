package com.hillel.Piatnytsia.homeworks.homework11;


import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        System.out.println("Будь-ласка введіть розмір матриці");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 1) {
            if (scanner.hasNextInt()) {
                int row = scanner.nextInt();
                int column = scanner.nextInt();
                if (row < 1 || column < 1) {
                    System.out.println("Будь-ласка введіть значення більше 0");
                    scanner.nextLine();
                    continue;
                }
                int[][] originalMatrix = new int[row][column];
                int[][] transposeMatrix = new int[column][row];
                System.out.println();
                System.out.println("Оригінальна матриця");
                for (int i = 0; i < originalMatrix.length; i++) {
                    for (int j = 0; j < originalMatrix[i].length; j++) {
                        originalMatrix[i][j] = (int) (Math.random() * 11);
                        System.out.print(originalMatrix[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Транспонована матриця");
                for (int i = 0; i < transposeMatrix.length; i++) {
                    for (int j = 0; j < transposeMatrix[i].length; j++) {
                        int temp = transposeMatrix[i][j];
                        transposeMatrix[i][j] = originalMatrix[j][i];
                        originalMatrix[j][i] = temp;
                        System.out.print(transposeMatrix[i][j] + "\t");
                    }
                    System.out.println();
                }

                counter++;
            } else {
                System.out.println("Треба вказати числові значення");
                scanner.nextLine();
            }
        }
    }
}
