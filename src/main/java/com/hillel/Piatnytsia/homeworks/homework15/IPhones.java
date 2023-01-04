package com.hillel.Piatnytsia.homeworks.homework15;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("\nЗвонки з iPhone стають простішими ");

    }

    @Override
    public void sms() {
        System.out.println("Функція iPhones sms  доступна завжди");

    }

    @Override
    public void internet() {
        System.out.println("iPhones для доступув інтернет використовує свої додатки");

    }

    @Override
    public void getOperationSystemsIos() {
        System.out.println("iPhones використовує iOS operations systems v12.5");
    }
}
