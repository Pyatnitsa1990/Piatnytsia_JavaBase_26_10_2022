package com.hillel.Piatnytsia.homeworks.homework3;

public class Parallelepiped {
    public static void main(String[] args){
        int length = 7;
        int width = 8;
        int height = 9;
        int volume = length * width * height;
        int lenghtAllSide = 4*(length + width + height);
        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Сумарна довжина всіх сторін паралелепіпеда = " + lenghtAllSide);
    }
}
