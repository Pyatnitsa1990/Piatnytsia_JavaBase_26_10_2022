package com.hillel.Piatnytsia.homeworks.homework16;

public class ClassicMusic extends MusicStyles {


    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Гурт " + getName() + " виконує класичну музику");

    }
}
