import java.awt.*;
import java.awt.image.ImageObserver;

public class Apple {
    private int x;
    private int y;

    public Apple(int x1, int y1){
        x = x1;
        y = y1;
    }

    public void draw(Graphics g){
        g.setColor(Color.RED);
        //g.drawImage(,x,y,new ImageObserver)  //make it an actual thing later
        g.fillOval(x,y,40,40);
    }

    public void move(){
        x = (int)(Math.random()*100);
        y = (int)(Math.random()*100);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}
