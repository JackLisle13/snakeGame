import java.awt.*;

public class Barrier extends Apple{

    public Barrier(int x1, int y1){
        super(x1,y1);
    }

    @Override
    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(getX(),getY(),50,50);
    }



}
