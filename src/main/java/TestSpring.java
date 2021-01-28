import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic.getSong());

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();
        //System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());

        context.close();
    }
}
