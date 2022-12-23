package com.hillel.Piatnytsia.homeworks.homework12;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlok", "Holmes", "London", "37742123513"));
    }

    static String personInfo(String name, String surname, String city, String phoneNumber) {

        return "Зателефонувати громадянинові " + name + " " + surname + " із міста " + city + " за телефоном " + phoneNumber;
    }
}

