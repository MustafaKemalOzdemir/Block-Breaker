import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Blocks {
	private int y;
	private int witdh=80;
	private int height=40;
	private int style;
	private int x;
	public int getX() {
		return x;
	}
		
		public abstract void draw (Graphics2D g);
			
			
		

	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWitdh() {
		return witdh;
	}
	public void setWitdh(int witdh) {
		this.witdh = witdh;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getStyle() {
		return style;
	}
	public void setStyle(int style) {
		this.style = style;
	}
	

}
