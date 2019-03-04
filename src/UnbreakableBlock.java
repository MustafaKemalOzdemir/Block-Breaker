

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class UnbreakableBlock extends Blocks{
		
	private int style=3;
		
		public void draw(Graphics2D g) {
			// TODO Auto-generated method stub
			
			g.setColor(Color.GRAY);
			g.fillRect(getX(), getY(), getWitdh(), getHeight());
			g.setStroke(new BasicStroke());
			g.setColor(Color.WHITE);
		g.drawRect(getX(), getY(), getWitdh(), getHeight());
			
		}

	}

