package package1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
   private final JButton start;
    private final JButton exit;
    private GridLayout layout;

    public Login() {

        layout = new GridLayout();
        setLayout(layout);

        start = new JButton(new ImageIcon("play.png"));
        add(start);

        exit = new JButton(new ImageIcon("exit.png"));
        add(exit);

        this.setSize(625, 477);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

      start.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       Login login=new Login();
       setVisible(false);
        try {
            Main main=new Main();
       main.setVisible(true);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
   });

    exit.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent event){

            System.exit(1);
    }
    });

    }

}
