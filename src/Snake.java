import java.awt.*;



public class Snake {

    private int x;
    private int y;
    private int xSpeed = 5;
    private int ySpeed = 0;

    public Snake(int x2, int y2){
        x = x2;
        y = y2;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x,y,35,35);
    }

    public void keyUp(){
        ySpeed = 5;
        xSpeed = 0;
    }
    public void keyDown(){
        ySpeed = -5;
        xSpeed = 0;
    }
    public void keyLeft(){
        xSpeed = -5;
        ySpeed = 0;
    }
    public void keyRight(){
        xSpeed = 5;
        ySpeed = 0;
    }

    public void move(){
        x += xSpeed;
        y += ySpeed;

    }



}
