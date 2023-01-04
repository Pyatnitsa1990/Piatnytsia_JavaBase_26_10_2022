package com.hillel.Piatnytsia.homeworks.homework16;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyle = {new PopMusic("Горячий шоколад"),
                new RockMusic("Linkin Park"),
                new ClassicMusic("Odri Band")};

        for (MusicStyles musicStyles : musicStyle) {
            musicStyles.playMusic();
        }
    }
}


