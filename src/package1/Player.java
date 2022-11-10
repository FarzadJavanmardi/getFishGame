package package1;

import javazoom.jl.decoder.JavaLayerException;

import java.io.BufferedInputStream;

public class Player {
    
    private Game game;
    private int score;
    GameOver gameOver=new GameOver();
    public Player(Game game) throws Exception {
        this.game=game;

    }


    public void getFish() throws JavaLayerException {
        if(game.tankObject.colission()){
            game.fishObject.setY(0);
            game.fishObject.xRandom();
            score+=10;
            System.out.println("your score is :"+score);
        }
        if(game.fishObject.getY()>=400) {
           gameOver.setVisible(true);
            game.setVisible(false);
            Music.stopMusic();
            GameOverMusic.playMusic1();
        }


        }

        public int getScore() {
        return score;
    }
}
