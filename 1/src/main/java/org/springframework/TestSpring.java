package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

       Music music=context.getBean("musicBean",RockMusic.class);
       MusicPlayer musicPlayer=new MusicPlayer(music);
       musicPlayer.playMusic();

        // Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer=new MusicPlayer(music);

        MusicPlayer firstMusicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer=context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison= firstMusicPlayer==secondMusicPlayer;
        System.out.println(comparison);

        musicPlayer.playMusic();

       System.out.println(musicPlayer.getName());
       System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
