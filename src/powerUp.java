import java.awt.Graphics2D;

public class powerUp {
	private int x,y,Vx=0,Vy=-2;
	public powerUp(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void draw(Graphics2D g) {
		g.fillOval(x, y, 5, 5);
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

}
