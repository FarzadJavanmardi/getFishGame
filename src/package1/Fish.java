package package1;

import javazoom.jl.decoder.JavaLayerException;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Random;

public class Fish {
    
  Random rand=new Random();
    
    private int x;
    private int y;
    private int ya=2;

    private BufferedImage fishImage;
    private Game game;
    
  public void move(){


    y=y+ya;


  }
    
  public void paint(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawImage(fishImage,x,y,null);
    }  

   public Fish(Game game)throws Exception{


    this.game=game;
    try{fishImage=ImageIO.read(new File("fishPic.png"));
        
    }catch(Exception e){
        System.err.println("not found Image");
    }
  
    }
   public Rectangle getBounds(){
        return new Rectangle(x,y,fishImage.getWidth(),fishImage.getHeight());
    }
 
   public void setY(int y){
     this.y=y;
 }


 public int getY(){
      return y;
     }
 public void xRandom(){
     x=rand.nextInt(570);
 }
}



