package com.hillel.Piatnytsia.homeworks.homework8;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int countShuttle = 0;

        for (int i = 1; countShuttle < 100; i++) {

            if (i % 10 == 4 || i % 10 == 9 || i / 10 == 4 || i / 10 == 9 || i / 10 % 10 == 4) {
                continue;
            }
            else {
                if (countShuttle < 99) {
                    System.out.print(i + ", ");
                    countShuttle++;
                } else {
                    System.out.print(i + " ");
                    countShuttle++;
                }
            }
        }
        System.out.println();
        System.out.println("Кількість шатлів нараховується: " + countShuttle);

    /*    System.out.println(i + "-й  Номер космічного шатла");
            countShuttle++;
        }
        System.out.println();
        System.out.println("Кількість шатлів нараховується: " + countShuttle);
    */
        }


}
