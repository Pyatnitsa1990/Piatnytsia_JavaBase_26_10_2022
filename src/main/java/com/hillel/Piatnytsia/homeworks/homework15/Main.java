package com.hillel.Piatnytsia.homeworks.homework15;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iphones = new IPhones();

        androids.call();
        androids.sms();
        androids.internet();
        androids.getOperationSystemsLinux();

        iphones.call();
        iphones.sms();
        iphones.internet();
        iphones.getOperationSystemsIos();

    }


}
