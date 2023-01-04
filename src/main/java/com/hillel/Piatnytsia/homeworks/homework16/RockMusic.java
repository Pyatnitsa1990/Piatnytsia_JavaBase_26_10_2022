package com.hillel.Piatnytsia.homeworks.homework16;

public class RockMusic extends MusicStyles {


    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Гурт " + getName() + " виконує рок-музику");
    }
}
