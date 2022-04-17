package com.example.musicplayer;

public class MusicPlayer {
    private Music music;
    private int vol = 100;
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public MusicPlayer(Music musicName) {
        this.music = musicName;
    }

    public MusicPlayer(){

    }
    public void playMusic(){
        System.out.println(music.getDescription());
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
