import java.awt.Color;
import java.awt.Graphics2D;

public class Ball {
	private int radius=20;
	private int x, y;
	private boolean movementChecker=false;
	private int Vx=0,Vy=0;
	
	public Ball(int x,int y,int width) {
		
		this.x = x+width/2-radius/2;
		this.y = y-radius;
		
	}
	public int getVx() {
		return Vx;
	}
	public void setVx(int vx) {
		Vx = vx;
	}
	public int getVy() {
		return Vy;
	}
	public void setVy(int vy) {
		Vy = vy;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isMovementChecker() {
		return movementChecker;
	}
	public void setMovementChecker(boolean movementChecker) {
		this.movementChecker = movementChecker;
	}
	public void draw(Graphics2D g) {
	g.setColor(Color.lightGray);
	g.drawOval(x, y, radius, radius);
	g.fillOval(x, y, radius, radius);
	}

}
