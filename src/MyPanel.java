import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public static final int XSTART = 90;
    public static final int YSTART = 80;
    public static final int BOXLENGTH = 50;

    Apple apple = new Apple(XSTART + BOXLENGTH * 7,YSTART + BOXLENGTH * 5);
    Snake snake = new Snake(XSTART + BOXLENGTH * 2,YSTART + BOXLENGTH * 5);
    public MyPanel() {
        setBackground(new Color(2,100,50));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(new Color(149,194,103));
        g.fillRect(85,75,555,555);
        g.setColor(new Color(147,212,80));
        int times = 0;
        for(int x = 85; x < 600; x += 50){
            for(int y = 75; y < 600; y += 50){

                if(times % 2 == 0) {
                    g.fillRect(x, y, 50, 50);
                }
                times ++;
            }
        }



        apple.draw(g);
        snake.move();
        snake.draw(g);


        try {
            Thread.sleep(20);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        repaint();
    }





}
