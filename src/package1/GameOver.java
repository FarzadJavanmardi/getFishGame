package package1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameOver extends JFrame {

    private BufferedImage gameoverImage;

    public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawImage(gameoverImage,0,0,null);

    }


      public GameOver() {

        try{gameoverImage= ImageIO.read(new File("gameOverPic2.jpg"));

        }catch(IOException e){

            e.printStackTrace();

        }

       setTitle("getFish");
       this.setSize(626,480);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(false);


   }

}
