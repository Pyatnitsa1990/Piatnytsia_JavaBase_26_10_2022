package com.hillel.Piatnytsia.homeworks.homework14.v3;

public class Date {
    private final int day;
    private final int month;
    private final int year;


    public Date(int birthDay, int birthMonth, int birthYear) {
        this.day = birthDay;
        this.month = birthMonth;
        this.year = birthYear;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "" +
                day + "." +
                month + "." +
                year +
                ' ';

    }
}
