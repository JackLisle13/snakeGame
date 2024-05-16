import java.awt.*;
import java.util.ArrayList;

public class Barrier{

    private int x;
    private int y;
    public Barrier(int x1, int y1,Graphics g){
        x = x1;
        y = y1;
        draw(g);
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(x,y,25,25);
    }


}
