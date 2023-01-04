package com.hillel.Piatnytsia.homeworks.homework16;

public class PopMusic extends MusicStyles {


    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Гурт " + getName() + " виконує поп-музику");
    }
}
