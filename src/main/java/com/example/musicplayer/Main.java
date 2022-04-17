package com.example.musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = c.getBean("musicPlayer1", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println("Громкость: " + musicPlayer.getVol());
        System.out.println("Название плеера: " + musicPlayer.getPlayerName());
        c.close();
    }
}
