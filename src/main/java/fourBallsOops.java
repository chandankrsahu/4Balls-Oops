import processing.core.PApplet;

public class fourBallsOops extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    Ball ball1,ball2,ball3,ball4,ball;
    int x1=0,x2=0,x3=0,x4=0;
    @Override
    public void setup() {
        ball=new Ball();
         ball1=new Ball();
        ball1.ballspeed=1;
         ball2=new Ball();
        ball2.ballspeed=2;
         ball3=new Ball();
        ball3.ballspeed=3;
         ball4=new Ball();
        ball4.ballspeed=4;
    }

    @Override
    public void draw() {
        getBall1();
        getBall2();
        getBall3();
        getBall4();
    }

    private void getBall4() {
        ellipse(x4+=ball4.ballspeed,ball.height5*4,DIAMETER,DIAMETER);
    }

    private void getBall3() {
        ellipse(x3+=ball3.ballspeed,ball.height5*3,DIAMETER,DIAMETER);
    }

    private void getBall2() {
        ellipse(x2+=ball2.ballspeed,ball.height5*2,DIAMETER,DIAMETER);
    }

    private void getBall1() {
        ellipse(x1+=ball1.ballspeed,ball.height5,DIAMETER,DIAMETER);
    }

    public static void main(String[] args) {
        PApplet.main("fourBallsOops",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

}
