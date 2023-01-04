package com.hillel.Piatnytsia.homeworks.homework15;

public class Androids implements Smartphones, Linux {
    @Override
    public void call() {
        System.out.println("Звонки на Android можливо записувати");
    }

    @Override
    public void sms() {
        System.out.println("Набор sms з Android дуже легкий для любих користувачів");

    }

    @Override
    public void internet() {
        System.out.println("Android для доступув в інтернет використовує різні додатки");
    }

    @Override
    public void getOperationSystemsLinux() {
        System.out.println("Android використовує Linux operations systems v13.2");
    }
}
