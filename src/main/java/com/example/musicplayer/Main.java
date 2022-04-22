package com.example.musicplayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = c.getBean("musicPlayer", MusicPlayer.class);
        Music music = c.getBean("someClassicalMusic", ClassicMusic.class);
        musicPlayer.setMusic(music);
        musicPlayer.playMusic();
        System.out.println(music.getDescription());
        c.close();
    }
}
