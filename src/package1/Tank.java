package package1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Tank implements KeyListener{
    
    private Game game;
   private int x;
   private int y=340;
   private int xa=3;
   private BufferedImage tankImage;
  
   
   
   public void move(){
       
       if(x+xa>500)
        xa=-3;
       if(x+xa<0)
          xa=3;
       
       x=x+xa;
       
   }
   
   
   public void paint(Graphics g){
       Graphics2D g2=(Graphics2D) g;
       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
       g2.drawImage(tankImage, x,y,null);
   }
           
           
           
   public Tank(Game game){
        this.game=game;
        try{tankImage=ImageIO.read(new File("tankPic.png"));
        
        }catch(Exception e){
            System.err.println("not found image !!!");
        }
    }

  
    
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,tankImage.getWidth(),tankImage.getHeight());
    }
    
    public boolean colission(){
        return game.fishObject.getBounds().intersects(getBounds());
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
    
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
         xa=-3;
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
         xa=3;
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }
}
