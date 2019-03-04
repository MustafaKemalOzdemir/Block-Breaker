import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

	public int level = 3;
	boolean SpaceChecker = false;
	mapGenerator map = new mapGenerator(level);
	Brick mainBrick = new Brick();
	Ball mainBall = new Ball(mainBrick.getX(), mainBrick.getY(), mainBrick.getWidth());
	Label GameEnd = new Label();

	private boolean testPowerup = false;
	JLabel l1 = new JLabel();
	powerUp[] pwrUp = new powerUp[2000];
	private int pwrCounter = 0;
	int time = 0;

	int counter = 0;
	Timer timer = new Timer(10, this);
	int totalPoint = 0;
	Label point = new Label();

	Label l3 = new Label("You Win");

	Label l2 = new Label();

	public GamePanel() {
		setLayout(null);
		GameEnd.setForeground(Color.WHITE);
		this.add(GameEnd);
		point.setBounds(900, 30, 80, 30);
		l3.setBounds(450, 300, 200, 50);
		l3.setForeground(Color.GREEN);
		l3.setVisible(false);
		GameEnd.setVisible(false);
		GameEnd.setBounds(400, 350, 300, 50);
		this.add(l3);
		this.add(l2);
		l2.setBounds(420, 300, 200, 50);
		l2.setText("Game is Over! press R to restart!!");
		l2.setForeground(Color.red);
		l2.setVisible(false);
		this.setBackground(Color.BLACK);
		addKeyListener(this);
		timer.start();
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		l1.setVisible(true);
		this.add(l1);
		this.add(point);

	}

	public void paintComponent(Graphics currentGraphics) {
		super.paintComponent(currentGraphics);

		l1.setText(String.valueOf(mainBrick.getX()));
		l1.setForeground(Color.WHITE);

		point.setText("Point: " + String.valueOf(totalPoint));
		point.setForeground(Color.WHITE);

		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		mainGraphics.setColor(Color.GREEN);
		mainGraphics.setStroke(new BasicStroke(3));
		mainGraphics.drawRect(0, 0, 983, 559);

		mainBrick.draw(mainGraphics);

		mainBall.draw(mainGraphics);

		map.draw(mainGraphics);
		for (int i = 0; i < pwrUp.length; i++) {
			if (pwrUp[i] != null) {
				pwrUp[i].draw(mainGraphics);
			}

		}

	}

	public void Stop() {
		mainBrick.setSpeed(0);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();

		int Code = e.getKeyCode();
		if (Code == KeyEvent.VK_SPACE) {
			mainBall.setMovementChecker(true);
			if (SpaceChecker == false) {
				mainBall.setVy(-3);
				mainBall.setVx(0);
			}
			SpaceChecker = true;

		}
		if (code == KeyEvent.VK_R) {
			mainBall.setX(mainBrick.getX() + mainBrick.getWidth() / 2 - mainBall.getRadius() / 2);
			mainBall.setY(mainBrick.getY() - mainBall.getRadius());
			mainBall.setVx(0);
			mainBall.setVy(0);
			mainBall.setMovementChecker(false);
			l2.setVisible(false);
			l3.setVisible(false);
			GameEnd.setVisible(false);
			level = 1;
			counter = 0;
			totalPoint = 0;
			map.setMap(level);
			SpaceChecker = false;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_LEFT || code == KeyEvent.VK_RIGHT) {
			Stop();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		for (int i = 0; i < pwrUp.length; i++) {
			if (pwrUp[i] != null) {
				pwrUp[i].setY(pwrUp[i].getY() - pwrUp[i].getVy());

			}

		}

		Point b = a.getLocation();
		int x = (int) b.getX();
		int y = (int) b.getY();
		if (mainBall.getY() > 610) {

			l2.setVisible(true);
			repaint();

		}
		counter = 0;
		for (int i = 0; i < map.map.length; i++) {
			for (int k = 0; k < map.map[0].length; k++) {
				if (map.map[i][k] != 0 && map.map[i][k] != 3) {
					counter++;
				}
			}
		}
		for (int i = 0; i < pwrUp.length; i++) {
			if (pwrUp[i] != null) {
				if (new Rectangle(pwrUp[i].getX(), pwrUp[i].getY(), 5, 5).intersects(mainBrick.getX(), mainBrick.getY(),
						mainBrick.getWidth(), mainBrick.getHeigt())) {
					pwrUp[i].setX(5000);
					pwrUp[i].setY(5000);
					totalPoint += 5;
				}
			}

		}
		if (counter == 0 && mainBall.isMovementChecker()) {

			l3.setVisible(true);
			l3.setText("Level " + level + " is completed!");
			if (level == 3) {

				GameEnd.setText("You Have Won The Game! Your final point is+" + totalPoint);
				GameEnd.setVisible(true);

			}
			timer.stop();
			level++;
			counter = 0;
			SpaceChecker = false;
			mainBall = new Ball(mainBrick.getX(), mainBrick.getY(), mainBrick.getWidth());
			map.setMap(level);

			while (time < 200000) {
				System.out.println(time);
				time++;
			}
			time = 0;

			l3.setVisible(false);
			timer.start();
		}
		if (level == 3 && counter == 0 && mainBall.isMovementChecker()) {

			l3.setBounds(450, 300, 200, 50);
			this.add(l3);
			timer.stop();

		}
		mainBrick.setSpeed((((x - mainBrick.getX()) / 20)) - 3);
		if (mainBrick.getX() < 0 || mainBrick.getX() > (975 - mainBrick.getWidth())) {
			mainBrick.setSpeed(0);
			mainBrick.setX(mainBrick.getX() + mainBrick.getSpeed());
			if (x < 1000 - mainBrick.getWidth() / 2 && x > mainBrick.getWidth() / 2) {
				mainBrick.setSpeed((((x - mainBrick.getX()) / 20)) - 3);
				mainBrick.setX(mainBrick.getX() + mainBrick.getSpeed());
			}

		} else {
			mainBrick.setX(mainBrick.getX() + mainBrick.getSpeed());
		}

		if (mainBrick.getX() >= 5 || mainBrick.getX() <= this.getWidth() - mainBrick.getWidth()) {
			mainBrick.setSpeed(0);
		}
		if (mainBall.isMovementChecker() == false) {
			mainBall.setX(mainBrick.getX() + mainBrick.getWidth() / 2 - mainBall.getRadius() / 2);
			mainBall.setY(mainBrick.getY() - mainBall.getRadius());
		}
		if (mainBall.isMovementChecker() == true) {
			mainBall.setX(mainBall.getX() + mainBall.getVx());
			mainBall.setY(mainBall.getY() + mainBall.getVy());
		}
		// bouncing from the borders
		if (mainBall.getX() < 0) {
			mainBall.setVx(-mainBall.getVx());
		}
		if (mainBall.getY() < 0) {
			mainBall.setVy(-mainBall.getVy());

		}
		if (mainBall.getX() > 965) {
			mainBall.setVx(-mainBall.getVx());
		}
		if (new Rectangle(mainBall.getX(), mainBall.getY(), 20, 20).intersects(mainBrick.getX(), mainBrick.getY(),
				mainBrick.getWidth(), mainBrick.getHeigt())) {
			mainBall.setVx((mainBall.getX() + 10 - (mainBrick.getX() + mainBrick.getWidth() / 2)) / 10);
			mainBall.setVy(-mainBall.getVy());
		}
		A: for (int i = 0; i < map.map.length; i++) {
			for (int k = 0; k < map.map[0].length; k++) {
				if (map.map[i][k] != 0) {

					if (new Rectangle(mainBall.getX(), mainBall.getY(), 20, 20)
							.intersects(new Rectangle(k * 80 + 60, i * 40 + 50, 80, 40))) {

						if (mainBall.getX() + 15 <= k * 80 + 60 || mainBall.getX() + 5 >= k * 80 + 60 + 80) {
							if (testPowerup == false) {
								mainBall.setVx(-mainBall.getVx());
								System.out.println("solX");

							}
						} else {
							if (testPowerup == false) {
								mainBall.setVy(-mainBall.getVy());

							}

						}
						if (map.map[i][k] == 1) {

							map.map[i][k] = 0;
							pwrUp[pwrCounter] = new powerUp(mainBall.getX(), mainBall.getY());
							pwrCounter++;

						}
						if (map.map[i][k] == 2) {

							map.map[i][k] = 1;

						}

						break A;
					}
				}

			}
		}

		repaint();

	}

}
