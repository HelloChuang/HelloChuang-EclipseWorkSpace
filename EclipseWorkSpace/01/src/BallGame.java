
import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
	
Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

double x = 100;
double y = 100;
double degree = 3.14/3;
public void paint(Graphics g) {
	g.drawImage(desk,0,0,null);
	g.drawImage(ball,(int)x,(int)y,null);
	x = x+2;
	
	x = x+10*Math.cos(degree);
	y = y +10*Math.sin(degree);
	if(y>500-30-40||y<80) {
		degree = -degree;
	}
	
	if(x>856-40-30||x<40) {
		degree = 3.14-degree;
	}
	
	
}
void launchFrame() {
setSize(856,500);
setLocation(50,50);
setVisible(true);
while(true) {
	repaint();
	try {
		Thread.sleep(40);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
public static void main(String[] args) {
	BallGame ballGame = new BallGame();
	ballGame.launchFrame();
}
}
