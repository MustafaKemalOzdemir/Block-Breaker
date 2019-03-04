import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
	Main main=new Main();
	public MenuPanel() {
		Button btn=new Button();
		this.setLayout(new BorderLayout());
		JLabel GreetingsLabel=new JLabel("Wecome to Block Braker");
		
		
		this.add(GreetingsLabel, BorderLayout.NORTH);
		btn.setLocation(200, 200);
		btn.setSize(200, 200);
		this.add(btn);
		
		
		
	}
	public void paintComponent(Graphics g) {
		
	}
	
	

}
class Button extends JPanel implements MouseListener{
	Main main=new Main();
	public Button() {
		JButton startButton=new JButton("=>START<=");
		startButton.addMouseListener(this);
		
		this.add(startButton,BorderLayout.CENTER);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		main.removePanelFromFrame(main.getMenuPanel());
		main.addPanel2Frame(main.getLevelPage());
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
