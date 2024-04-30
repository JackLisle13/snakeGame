import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.setVisible(true);
        frame.setSize(700,700);
        frame.add(panel);


        frame.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int key = e.getKeyCode();
                //System.out.println(key);
                panel.keySnake(key);

            }

        });









        //return click cords
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("x: " + e.getX() + "    y: " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        }); // end of just returning click cords



    }
}