
package package1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class GameOverMusic {

    public GameOverMusic() {

    }
    static File f1 = new File("gameOverMusic.mp3");
    static FileInputStream fis1;

    static {
        try {
            fis1 = new FileInputStream(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static BufferedInputStream bis1=new BufferedInputStream(fis1);
    static  javazoom.jl.player.Player player1;

    static {
        try {
            player1 = new Player(bis1);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }


    static void playMusic1() throws JavaLayerException {
        player1.play();
    }

    static void stopMusic1() throws JavaLayerException{
        player1.close();
    }

}
