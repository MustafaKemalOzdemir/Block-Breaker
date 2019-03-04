import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class SimpleBlock extends Blocks  {
	private int style=1;

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub

		g.setColor(Color.BLUE);
		g.fillRect(getX(), getY(), getWitdh(), getHeight());
		g.setStroke(new BasicStroke());
		g.setColor(Color.WHITE);
		g.drawRect(getX(), getY(), getWitdh(), getHeight());

	}
}
