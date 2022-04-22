package com.example.musicplayer;

import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicMusic implements Music{
    @Override
    public String getDescription() {
        return "Classic Music";
    }
}
