package package1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Music extends Thread {


    public Music() throws FileNotFoundException, JavaLayerException {

    }

    static File f = new File("BackgroundMusic.mp3");
    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static BufferedInputStream bis = new BufferedInputStream(fis);
    static javazoom.jl.player.Player player;

    static {
        try {
            player = new Player(bis);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }


    public void playMusic() throws JavaLayerException {
        player.play();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void stopMusic() throws JavaLayerException {
        player.close();
    }


}







