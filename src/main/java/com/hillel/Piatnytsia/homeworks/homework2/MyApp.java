package com.hillel.Piatnytsia.homeworks.homework2;

public class MyApp {
    public static void main(String[] args) {
        //перший варіант десяткові градуси, який вказано в умові до завдання
        double latitude = 48.396388;
        double longitude = 35.031815;
        System.out.println(latitude + "," + longitude);

        //другий варіант градуси,хвилини та секунди, який було показано на лекції
        byte degreeN = 48;
        short minuteN = 23;
        float secondN = 46.7f;

        byte degreeW = 35;
        short minuteW = 1;
        float secondW = 53.7f;

        String symbolDegree = "\u00B0";
        String symbolMinute = "\u0027";

        char symbolLatitude = 'N';
        char symbolLongitude = 'E';
        System.out.println(degreeN + symbolDegree + minuteN + symbolMinute + secondN + "\"" + symbolLatitude + " and " + degreeW + symbolDegree + minuteW + symbolMinute + secondW + "\"" + symbolLongitude);
    }
}
