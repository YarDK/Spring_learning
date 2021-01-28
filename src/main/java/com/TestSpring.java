package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.setMusicList(Arrays.asList(
                context.getBean("rockMusic", Music.class),
                context.getBean("classicalMusic", ClassicalMusic.class),
                context.getBean("jazzMusic", JazzMusic.class)
        ));
        musicPlayer.playMusic();

        context.close();
    }
}
;