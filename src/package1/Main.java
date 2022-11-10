
package package1;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MulticastSocket;
import javax.swing.*;

public class Main extends JFrame{


    Music music;

    public Main() throws Exception {


        Game game=new Game();
        add(game);
        addKeyListener(game);
        setTitle("getFish");



        this.setSize(626,480);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(false);

    }
    
   
        public static void main(String[] args) throws Exception {
            new Login();
         Music music=new Music();
         music.playMusic();



    }

}
