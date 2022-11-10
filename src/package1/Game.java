
package package1;

import javazoom.jl.decoder.JavaLayerException;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Game extends JPanel implements Runnable,KeyListener {
    
    private Thread threadFish;
  
    Fish fishObject=new Fish(this);
   Tank tankObject=new Tank(this);
    Player playerObj=new Player(this);

    
    private BufferedImage backImage;
    public Game()throws Exception{

        try{
            backImage=ImageIO.read(new File("backgroundpic1.jpg"));




                }catch(Exception e){
                    System.err.println("not found back image!!");
                }
    }

  public void addNotify(){
      super.addNotify();
      threadFish=new Thread(this);
      threadFish.start();


  }
    
  public void paint(Graphics g){
      Graphics2D g2=(Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
      g2.drawImage(backImage,0,0,null);
      fishObject.paint(g2);
      tankObject.paint(g);


      
  }




    public void move() throws JavaLayerException {
       fishObject.move();
       tankObject.move();
        playerObj.getFish();

    }

    @Override
    public void run(){

        while(true){

            try {

                move();

                try {

                   if(playerObj.getScore()<50) {
                       Thread.sleep(8);

                   }
               if(playerObj.getScore()>=50 && playerObj.getScore()<200){
                   Thread.sleep(7);
                    }
                    if(playerObj.getScore()>=200 && playerObj.getScore()<300){
                        Thread.sleep(6);
                    }
                    if(playerObj.getScore()>=300 && playerObj.getScore()<400){
                        Thread.sleep(5);
                    }
                    if(playerObj.getScore()>=400 && playerObj.getScore()<500){
                        Thread.sleep(4);
                    }
                    if(playerObj.getScore()>=500 && playerObj.getScore()<600){
                        Thread.sleep(3);
                    }
                    if(playerObj.getScore()>=600){
                        Thread.sleep(2);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }


            repaint();

        } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
       tankObject.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }
    
    
}
