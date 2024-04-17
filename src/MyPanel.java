import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {


    public MyPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(500,500));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Apple apple = new Apple(50,50);
        apple.draw(g);


        try {
            Thread.sleep(20);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        repaint();
    }





}
