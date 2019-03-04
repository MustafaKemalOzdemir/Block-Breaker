import java.awt.Color;
import java.awt.Graphics2D;

public class Brick {
	private int x=450,y=530,speed=0,width=100,heigt=20;
	
	public void draw(Graphics2D g) {
	g.setColor(Color.GRAY);
	g.fillRect(x, y, width, heigt);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigt() {
		return heigt;
	}

	public void setHeigt(int heigt) {
		this.heigt = heigt;
	}

}
