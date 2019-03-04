
import java.awt.Component;

import javax.swing.JFrame;


public class Main {
	static GamePanel panel;
	static Menu menu;
	static JFrame f;

	public static void main(String[] args) {
		f = new JFrame();
		menu=new Menu();
		panel = new GamePanel();
		f.add(menu);
		//f.add(panel);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000, 600);
		f.setVisible(true);
		f.setTitle("OOP-GAME");
	}

	public static GamePanel getPanel() {
		return panel;
	}
	public static Menu getMenu() {
		return menu;
	}
	public static void addPanel2Frame(Component Comp) {
		f.add(Comp);
		f.dispose();
		f.setVisible(true);
		//SwingUtilities.updateComponentTreeUI(f);
	}
	public static void removePanelFromFrame(Component Comp) {
		f.remove(Comp);
		//SwingUtilities.updateComponentTreeUI(f);
		f.dispose();
		f.setVisible(true);
	}

}

