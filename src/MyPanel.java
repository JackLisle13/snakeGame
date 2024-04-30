import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel {

    public static final int XSTART = 90;
    public static final int YSTART = 80;
    public static final int BOXLENGTH = 50;

    private int score = 0;

    Apple apple = new Apple(XSTART + BOXLENGTH * 7,YSTART + BOXLENGTH * 5);
    Snake snake = new Snake(XSTART + BOXLENGTH * 2,YSTART + BOXLENGTH * 5);
    public MyPanel() {
        setBackground(new Color(2,100,50));
    }


    public void keySnake(int key){
            if (key == 38) {
                snake.keyUp();
                return;
            }
            if (key == 37) {
                snake.keyLeft();
                return;
            }
            if (key == 40) {
                snake.keyDown();
                return;
            }
            if (key == 39) {
                snake.keyRight();
                return;
            }
    }

    private int highScore = 0;

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

        if(Math.abs(snake.getX() - apple.getX()) <= 30 && Math.abs(snake.getY() - apple.getY()) <= 30){
            score ++;
            apple.move();
            g.drawString("Score: " + score,20,30);
        }

        if(snake.getX() <= XSTART - 5 || snake.getY() <= YSTART - 5 || snake.getX() >= (XSTART + BOXLENGTH*11) - 35|| snake.getY()>= (YSTART + BOXLENGTH*11) - 35){
            snake.stop();
            g.setColor(Color.WHITE);
            g.fillRect(250,250,200,200);
            g.setColor(Color.RED);
            if(highScore <= score){
                highScore = score;
            }
            g.drawString("You Lose",300,300);
            g.drawString("High Score:" + highScore,300,350);
            score = 0;
        }

        g.setColor(Color.WHITE);
        g.drawString("Score: " + score,20,30);



        try {
            Thread.sleep(20);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        repaint();
    }





}
