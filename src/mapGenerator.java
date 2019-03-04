
import java.awt.Graphics2D;

public class mapGenerator {
	public int map[][];

	public mapGenerator(int level) {
		setMap(level);
	}

	public int[][] getMap() {
		return map;
	}

	public void setMap(int level) {

		if (level == 1) {
			int map[][] = { { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
					{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
					{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 } };
			this.map = map;
		}
		if (level == 2) {
			int map[][] = { { 0, 0, 0, 3, 1, 1, 1, 3, 0, 0, 0 }, { 0, 0, 3, 1, 1, 2, 1, 1, 3, 0, 0 },
					{ 0, 3, 1, 1, 2, 1, 2, 1, 1, 3, 0 }, { 3, 1, 1, 2, 1, 3, 1, 2, 1, 1, 3 },
					{ 0, 3, 1, 1, 2, 1, 2, 1, 1, 3, 0 }, { 0, 0, 3, 1, 1, 2, 1, 1, 3, 0, 0 } };
			this.map = map;
		}
		if (level == 3) {
			int map[][] = { { 0, 0, 0, 3, 1, 2, 0, 0, 3, 1, 2 }, { 0, 0, 3, 1, 2, 1, 0, 3, 1, 2, 1 },
					{ 0, 3, 1, 2, 1, 0, 3, 1, 2, 1, 0 }, { 3, 1, 2, 1, 0, 3, 1, 2, 1, 0, 0 },
					{ 1, 2, 1, 0, 0, 1, 2, 1, 0, 0, 0 }, { 2, 1, 0, 0, 0, 2, 1, 0, 0, 0, 0 } };
			this.map = map;
		}
	}

	public void draw(Graphics2D g) {
		for (int i = 0; i < map.length; i++) {
			for (int k = 0; k < map[0].length; k++) {
				if (map[i][k] == 1) {

					Blocks a = new SimpleBlock();
					a.setX(k * 80 + 60);
					a.setY(i * 40 + 50);
					a.draw(g);
				}

				if (map[i][k] == 2) {

					Blocks a = new DoubleBlock();
					a.setX(k * 80 + 60);
					a.setY(i * 40 + 50);
					a.draw(g);
				}

				if (map[i][k] == 3) {

					Blocks a = new UnbreakableBlock();
					a.setX(k * 80 + 60);
					a.setY(i * 40 + 50);
					a.draw(g);
				}

			}

		}

	}

}
