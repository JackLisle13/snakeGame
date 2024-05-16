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
        while(x != 90 && x!= 140 && x!= 190 && x!= 240 && x!= 290 && x!= 340 && x!= 390 && x!= 490 && x!=540 && x!= 590 && x!=440){
            move();
        }
        ySpeed = -5;
        xSpeed = 0;
    }
    public void keyDown(){
        while(x != 90 && x!= 140 && x!= 190 && x!= 240 && x!= 290 && x!= 340 && x!= 390 && x!= 490 && x!=540 && x!= 590 && x!=440){
            move();
        }
        ySpeed = 5;
        xSpeed = 0;
    }
    public void keyLeft(){
        while(y != 20 && y!= 80 && y!=130&&y!=180&&y!=230&&y!=280&&y!=330&&y!=380&&y!=430&&y!=480&&y!=530&&y!=580){
            move();
        }
        xSpeed = -5;
        ySpeed = 0;
    }
    public void keyRight(){
        while(y != 20 && y!= 80 && y!=130&&y!=180&&y!=230&&y!=280&&y!=330&&y!=380&&y!=430&&y!=480&&y!=530&&y!=580){
            move();
        }
        xSpeed = 5;
        ySpeed = 0;
    }

    public void move(){
        x += xSpeed;
        y += ySpeed;
    }

    public void stop(){
        xSpeed = 0;
        ySpeed = 0;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


}
